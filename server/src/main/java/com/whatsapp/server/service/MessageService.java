package com.whatsapp.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Message service.
 * ================
 *
 * Service for the message entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Service
public class MessageService {
    @Autowired
    private MessageService repository;
}
