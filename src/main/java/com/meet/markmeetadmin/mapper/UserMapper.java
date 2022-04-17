package com.meet.markmeetadmin.mapper;

import com.meet.markmeetadmin.model.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LianQianChao
 */
@Mapper
public interface UserMapper {

    int selectUserByNameAndPassword(UserVO userVO);
}
