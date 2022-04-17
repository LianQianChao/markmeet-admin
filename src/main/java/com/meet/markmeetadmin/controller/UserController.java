package com.meet.markmeetadmin.controller;

import com.meet.markmeetadmin.model.vo.UserVO;
import com.meet.markmeetadmin.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LianQianChao
 */
@RestController
public class UserController {

    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping("/login")
    public Boolean login(UserVO userVO){
        System.out.println(userVO.toString());
        Integer result = userServiceImpl.selectUserByNameAndPassword(userVO);
        return result == 1;
    }
}
