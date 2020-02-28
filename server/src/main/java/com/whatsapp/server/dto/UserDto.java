package com.whatsapp.server.dto;

import lombok.Data;

/**
 * User dto.
 * =========
 *
 * DTO for the user entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Data
public class UserDto {
    private String id;
    private String phone;
    private String name;
}
