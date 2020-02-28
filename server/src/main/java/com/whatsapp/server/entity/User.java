package com.whatsapp.server.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

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
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column
    private String phone;

    @Column
    private String name;

    @OneToMany(mappedBy = "from", fetch = FetchType.LAZY)
    private List<Message> sentMessages;

    @OneToMany(mappedBy = "to", fetch = FetchType.LAZY)
    private List<Message> receivedMessage;
}
