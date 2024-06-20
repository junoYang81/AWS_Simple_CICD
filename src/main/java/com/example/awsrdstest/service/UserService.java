package com.example.awsrdstest.service;

import com.example.awsrdstest.dto.UserCreateDTO;
import com.example.springbootexample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.springbootexample.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public com.example.springbootexample.entity.User createUser(UserCreateDTO userDto) {
        com.example.springbootexample.entity.User user = new User();
        user.setId(userDto.getId());
        user.setPassword(userDto.getPassword());
        user.setName(userDto.getName());
        return userRepository.save(user);
    }
}
