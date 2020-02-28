package com.whatsapp.server.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Message entity.
 * ===============
 *
 * Represents a message.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Entity
@Data
public class Message {
    @Id
    private long id;

    @Column(columnDefinition = "TEXT")
    private String text;

    @Column
    @Enumerated
    private MessageStatus status;

    @ManyToOne
    @JoinColumn(name = "from_id")
    private User from;

    @ManyToOne
    @JoinColumn(name = "to_id")
    private User to;
}
