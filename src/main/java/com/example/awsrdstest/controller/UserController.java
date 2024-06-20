package com.example.awsrdstest.controller;

import com.example.awsrdstest.dto.UserCreateDTO;
import com.example.awsrdstest.dto.UserResponseDTO;
import com.example.awsrdstest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootexample.entity.User;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<UserResponseDTO> getUsers() {
        List<UserResponseDTO> users = userService.getUserList()
                .stream()
                .map(u -> new UserResponseDTO(u.getId(), u.getName()))
                .collect(Collectors.toList());
        return users;
    }

    @PostMapping("/users")
    public UserResponseDTO createNewUser(@RequestBody UserCreateDTO userDto){
        User user = userService.createUser(userDto);
        return new UserResponseDTO(user.getId(),user.getName());
    }
}
