package com.whatsapp.server.controller;

import com.whatsapp.server.dto.MessageDto;
import com.whatsapp.server.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
