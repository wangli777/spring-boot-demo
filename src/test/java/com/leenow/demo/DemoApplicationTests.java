package com.leenow.demo;

import com.leenow.demo.entity.User;
import com.leenow.demo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        Assert.assertEquals(2,users.size());
        users.forEach(System.out::println);
    }

}
