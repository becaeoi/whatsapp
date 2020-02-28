package com.whatsapp.server.repository;

import com.whatsapp.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User repository.
 * ================
 *
 * Repository for the user entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
