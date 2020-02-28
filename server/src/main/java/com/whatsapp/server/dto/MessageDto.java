package com.whatsapp.server.dto;

import lombok.Data;

/**
 * Message dto.
 * ============
 *
 * DTO for the message entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Data
public class MessageDto {
    private long id;
    private String text;
    private int status;
    private long from_id;
    private long to_id;
}
