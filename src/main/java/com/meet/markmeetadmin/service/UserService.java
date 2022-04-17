package com.meet.markmeetadmin.service;

import com.meet.markmeetadmin.model.vo.UserVO;

/**
 * @author LianQianChao
 */
public interface UserService {

    Integer selectUserByNameAndPassword(UserVO userVO);
}
