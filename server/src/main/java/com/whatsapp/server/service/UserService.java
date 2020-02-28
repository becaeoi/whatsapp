package com.whatsapp.server.service;

import com.whatsapp.server.entity.User;
import com.whatsapp.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
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
        return findByPhone(phone).orElseGet(() -> {
            User user = new User();
            user.setName(name);
            user.setPhone(phone);

            System.out.println(user.getId());

            return repository.save(user);
        });
    }

    /**
     * Returns the user with the given phone.
     *
     * @param phone User phone.
     *
     * @return User with the given phone.
     */
    public Optional<User> findByPhone(String phone) {
        return repository.findByPhone(phone);
    }

    /**
     * Returns the user with the given id.
     *
     * @param id User id.
     *
     * @return User with the given id.
     */
    public Optional<User> findById(String id) {
        return repository.findById(UUID.fromString(id));
    }
}
