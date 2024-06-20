package com.example.awsrdstest.service;

import com.example.awsrdstest.dto.UserCreateDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    void 테스트(){
        UserCreateDTO userDto = new UserCreateDTO("1111", "aaa");
        userService.createUser(userDto);
        assertThat(user.g)
    }

}