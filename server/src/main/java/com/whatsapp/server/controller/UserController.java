package com.whatsapp.server.controller;

import com.whatsapp.server.dto.UserDto;
import com.whatsapp.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User controller.
 * ================
 *
 * Controller for the user entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final ModelMapper mapper;

    @PostMapping("register")
    public UserDto register(@RequestBody UserDto user) {
        return mapper.map(
                userService.register(user.getName(), user.getPhone()),
                UserDto.class
        );
    }
}
