package com.whatsapp.server.controller;

import com.whatsapp.server.dto.MessageDto;
import com.whatsapp.server.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Message controller.
 * ===================
 *
 * Controller for the message entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;
    private final ModelMapper    mapper;

    /**
     * Sends the given message to the given user.
     *
     * @param message Message to send.
     *
     * @return Message sent.
     */
    @PostMapping("/send")
    public MessageDto send(@RequestBody MessageDto message) {
        return mapper.map(
                messageService.send(message.getFrom_id(), message.getTo_id(), message.getText()),
                MessageDto.class
        );
    }

    /**
     * Returns the user inbox.
     *
     * @param id User id.
     *
     * @return Received messages of given user.
     */
    @GetMapping("inbox/{id}")
    public List<MessageDto> inbox(@PathVariable String id) {
        return mapper.map(
                messageService.inbox(id),
                new TypeToken<List<MessageDto>>(){}.getRawType()
        );
    }
}
