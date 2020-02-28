package com.whatsapp.server.service;

import com.whatsapp.server.entity.User;
import com.whatsapp.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

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

    /**
     * Registers a new user.
     *
     * @param name  User name.
     * @param phone User phone.
     *
     * @return Registered user.
     */
    public User register(String name, String phone) {
        User user = repository.findByPhone(phone);
        if (user != null) {
            return user;
        }

        user = new User();
        user.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
        user.setName(name);
        user.setPhone(phone);

        return repository.save(user);
    }
}
