package com.example.demo02.mapper;

import com.example.demo02.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void list(){
        userMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void insert(){
        User user = new User();
        user.setId(3L);
        user.setName("Hello");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }
    
}