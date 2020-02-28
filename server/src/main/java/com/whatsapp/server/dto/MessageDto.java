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
    private String id;
    private String text;
    private int status;
    private String from_id;
    private String to_id;
}
