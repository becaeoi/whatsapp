package com.whatsapp.server.controller;

import com.whatsapp.server.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RestController;

/**
 * Message controller.
 * ===================
 *
 * Controller for the message entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@RestController("/message")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;
    private final ModelMapper    mapper;
}
