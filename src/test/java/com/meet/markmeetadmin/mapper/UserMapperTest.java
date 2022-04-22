package com.meet.markmeetadmin.mapper;

import com.meet.markmeetadmin.model.entity.User;
import com.meet.markmeetadmin.model.vo.LoginVO;
import com.meet.markmeetadmin.model.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LianQianChao
 */
@SpringBootTest
@Slf4j
@Transactional
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void selectUserByNamePassword(){
        int count = userMapper.selectUserByNameAndPassword(new LoginVO("aaa","12345"));
        Assertions.assertEquals(1, count);
        log.info("select User: "+count);
    }

    @Test
    public void getAllUsers(){
        List<User> users = userMapper.getAllUsers();
        log.info("########GetAllUser#########");
        log.info(users.toString());
    }

    @Test
    public void addUser(){
        int count = userMapper.addUser(new UserVO("admin1","123456","黎明","i@lchao.cc"));
        Assertions.assertEquals(1,count);
    }
}
