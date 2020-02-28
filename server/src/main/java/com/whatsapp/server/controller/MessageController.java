package com.whatsapp.server.controller;

import com.whatsapp.server.dto.MessageDto;
import com.whatsapp.server.entity.Message;
import com.whatsapp.server.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
        Message    msg = messageService.send(message.getFrom_id(), message.getTo_id(), message.getText());
        MessageDto dto = mapper.map(msg, MessageDto.class);

        dto.setTo_id(
                msg.getTo()
                   .getId()
                   .toString()
        );

        dto.setFrom_id(
                msg.getFrom()
                   .getId()
                   .toString()
        );

        return dto;
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
        return messageService.inbox(id)
                             .stream()
                             .map(message -> {
                                 MessageDto dto = mapper.map(message, MessageDto.class);
                                 dto.setFrom_id(
                                         message.getFrom()
                                                .getId()
                                                .toString()
                                 );

                                 dto.setTo_id(
                                         message.getTo()
                                                .getId()
                                                .toString()
                                 );

                                 return dto;
                             })
                             .collect(Collectors.toList());
    }
}
