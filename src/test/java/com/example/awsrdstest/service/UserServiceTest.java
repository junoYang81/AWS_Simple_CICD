package com.example.awsrdstest.service;

import com.example.awsrdstest.dto.UserCreateDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    void 테스트(){
        UserCreateDTO userDto = new UserCreateDTO(1111, "aaa", "손흥민");

        userService.createUser(userDto);

        assertThat(userDto.getId()).isGreaterThan(0);
    }

}