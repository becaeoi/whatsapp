package com.whatsapp.server.repository;

import com.whatsapp.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * User repository.
 * ================
 *
 * Repository for the user entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    /**
     * Returns the user by its phone number.
     *
     * @param phone Phone number.
     *
     * @return User with given phone number.
     */
    Optional<User> findByPhone(String phone);
}
