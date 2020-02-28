package com.whatsapp.server.controller;

import com.whatsapp.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RestController;

/**
 * User controller.
 * ================
 *
 * Controller for the user entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@RestController("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final ModelMapper mapper;
}
