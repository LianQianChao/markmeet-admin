package com.meet.markmeetadmin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meet.markmeetadmin.mapper.UserMapper;
import com.meet.markmeetadmin.model.entity.User;
import com.meet.markmeetadmin.model.vo.LoginVO;
import com.meet.markmeetadmin.model.vo.UserVO;
import com.meet.markmeetadmin.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LianQianChao
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {

        this.userMapper = userMapper;
    }


    @Override
    public Boolean selectUserByNameAndPassword(LoginVO loginVO) {
        return userMapper.selectUserByNameAndPassword(loginVO) == 1;
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public PageInfo<User> getAllUserByPage(int page, int offset) {
        PageHelper.startPage(page, offset);
        List<User> users = userMapper.getAllUsers();
        return new PageInfo<>(users);
    }

    @Override
    public Boolean addUser(UserVO userVO) {
        return userMapper.addUser(userVO) == 1;
    }

}
