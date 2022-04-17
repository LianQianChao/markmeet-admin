package com.meet.markmeetadmin.service;

import com.meet.markmeetadmin.model.vo.UserVO;

/**
 * @author LianQianChao
 */
public interface UserService {

    Boolean selectUserByNameAndPassword(UserVO userVO);
}
