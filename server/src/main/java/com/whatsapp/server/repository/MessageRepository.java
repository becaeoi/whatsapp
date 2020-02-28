package com.whatsapp.server.repository;

import com.whatsapp.server.entity.Message;
import com.whatsapp.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * Message repository.
 * ===================
 *
 * Repository for the message entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface MessageRepository extends JpaRepository<Message, UUID> {
    /**
     * Returns all messages sent to the given user.
     *
     * @param to User.
     *
     * @return Messages sent to the user.
     */
    List<Message> findAllByTo(User to);
}
