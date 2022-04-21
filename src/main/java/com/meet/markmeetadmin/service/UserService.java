package com.meet.markmeetadmin.service;

import com.github.pagehelper.PageInfo;
import com.meet.markmeetadmin.model.entity.User;
import com.meet.markmeetadmin.model.vo.UserVO;

import java.util.List;

/**
 * @author LianQianChao
 */
public interface UserService {

    Boolean selectUserByNameAndPassword(UserVO userVO);

    List<User> getAllUsers();

    PageInfo<User> getAllUserByPage(int page,int offset);
}
