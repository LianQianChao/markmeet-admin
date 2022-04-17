package com.meet.markmeetadmin.mapper;

import com.meet.markmeetadmin.model.vo.UserVO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author LianQianChao
 */
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void selectUserByNamePassword(){
        int count = userMapper.selectUserByNameAndPassword(new UserVO("aaa","12345"));
        System.out.println("has user :"+count);
    }
}
