package com.meet.markmeetadmin.mapper;

import com.meet.markmeetadmin.model.entity.User;
import com.meet.markmeetadmin.model.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LianQianChao
 */
@SpringBootTest
@Slf4j
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void selectUserByNamePassword(){
        int count = userMapper.selectUserByNameAndPassword(new UserVO("aaa","12345"));
        log.info("select User: "+count);
    }

    @Test
    public void getAllUsers(){
        List<User> users = userMapper.getAllUsers();
        log.info("########GetAllUser#########");
        log.info(users.toString());
    }
}
