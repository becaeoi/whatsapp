package com.whatsapp.server.controller;

import com.whatsapp.server.dto.UserDto;
import com.whatsapp.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("byPhone/{phone}")
    public UserDto byPhone(@PathVariable("phone") String phone) {
        return mapper.map(
                userService.findByPhone(phone)
                           .orElseThrow(RuntimeException::new),
                UserDto.class
        );
    }

    @GetMapping("byId/{id}")
    public UserDto byId(@PathVariable("id") String id) {
        System.out.println(id);

        return mapper.map(
                userService.findById(id)
                           .orElseThrow(RuntimeException::new),
                UserDto.class
        );
    }
}
