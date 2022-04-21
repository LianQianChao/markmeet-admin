package com.meet.markmeetadmin.controller;

import com.meet.markmeetadmin.common.http.ResultCode;
import com.meet.markmeetadmin.exception.APIException;
import com.meet.markmeetadmin.model.vo.UserVO;
import com.meet.markmeetadmin.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author LianQianChao
 */
@RestController
public class LoginController {

    private final UserServiceImpl userServiceImpl;

    public LoginController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping("/login")
    public String login(@RequestBody @Valid UserVO userVO){
        if(!userServiceImpl.selectUserByNameAndPassword(userVO)){
            throw new APIException(ResultCode.LOGIN_FAILED);
        }
        return "登录成功";
    }

}
