package com.whatsapp.server.service;

import com.whatsapp.server.entity.Message;
import com.whatsapp.server.entity.MessageStatus;
import com.whatsapp.server.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Message service.
 * ================
 *
 * Service for the message entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository repository;
    private final UserService       userService;

    /**
     * Sends the given message to the given user.
     *
     * @param from_id Author ID.
     * @param to_id   Receiver ID.
     * @param text    Message content.
     *
     * @return Created message.
     */
    public Message send(String from_id, String to_id, String text) {
        Message message = new Message();
        message.setFrom(userService.findById(from_id).orElseThrow(RuntimeException::new));
        message.setTo(userService.findById(to_id).orElseThrow(RuntimeException::new));
        message.setText(text);
        message.setStatus(MessageStatus.SENT);

        return repository.save(message);
    }

    /**
     * Returns a user inbox.
     *
     * @param id User id.
     *
     * @return User received messages.
     */
    public List<Message> inbox(String id) {
        return repository.findAllByTo(
                userService.findById(id).orElseThrow(RuntimeException::new)
        );
    }
}
