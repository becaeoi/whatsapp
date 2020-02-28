package com.whatsapp.server.service;

import com.whatsapp.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User service.
 * =============
 *
 * Service for the user entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Service
public class UserService {
    @Autowired
    private UserRepository repository;
}
