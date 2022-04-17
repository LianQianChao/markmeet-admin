package com.meet.markmeetadmin.service.impl;

import com.meet.markmeetadmin.mapper.UserMapper;
import com.meet.markmeetadmin.model.vo.UserVO;
import com.meet.markmeetadmin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author LianQianChao
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper){

        this.userMapper = userMapper;
    }


    @Override
    public Boolean selectUserByNameAndPassword(UserVO userVO) {
        return userMapper.selectUserByNameAndPassword(userVO) == 1;
    }
}
