package com.whatsapp.server.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * User entity.
 * ============
 *
 * Represents an user.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Entity
@Data
public class User {
    @Id
    private long id;

    @Column
    private String phone;

    @Column
    private String name;

    @OneToMany(mappedBy = "from", fetch = FetchType.LAZY)
    private List<Message> sentMessages;

    @OneToMany(mappedBy = "to", fetch = FetchType.LAZY)
    private List<Message> receivedMessage;
}
