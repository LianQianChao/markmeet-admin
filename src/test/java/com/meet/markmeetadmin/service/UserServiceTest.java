package com.meet.markmeetadmin.service;

import com.github.pagehelper.PageInfo;
import com.meet.markmeetadmin.model.entity.User;
import com.meet.markmeetadmin.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author LianQianChao
 */
@SpringBootTest
@Slf4j
public class UserServiceTest {

    @Resource
    private UserServiceImpl userService;

    @Test
    public void findAllUserByPage() {
        PageInfo<User> users = userService.getAllUserByPage(1, 2);
        log.info("findAllUserByPage: ====>" + users);
    }
}
