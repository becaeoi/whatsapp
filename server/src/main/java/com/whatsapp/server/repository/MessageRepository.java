package com.whatsapp.server.repository;

import com.whatsapp.server.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

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
}
