package com.example.awsrdstest.service;

import com.example.awsrdstest.dto.UserCreateDTO;
import com.example.awsrdstest.entity.User;
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
    void 사용자생성테스트(){
        //given
        UserCreateDTO userDto = new UserCreateDTO("aaa", "1111", "홍길동", "a@naver.com");
        //when
        User user = userService.createUser(userDto);
        //then
        assertThat(user.getId()).isGreaterThan(0);
    }
}