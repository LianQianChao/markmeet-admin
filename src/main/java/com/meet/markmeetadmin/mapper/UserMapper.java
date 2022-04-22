package com.meet.markmeetadmin.mapper;

import com.meet.markmeetadmin.model.entity.User;
import com.meet.markmeetadmin.model.vo.LoginVO;
import com.meet.markmeetadmin.model.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author LianQianChao
 */
@Mapper
public interface UserMapper {

    int selectUserByNameAndPassword(LoginVO loginVO);

    List<User> getAllUsers();

    int addUser(UserVO userVO);
}
