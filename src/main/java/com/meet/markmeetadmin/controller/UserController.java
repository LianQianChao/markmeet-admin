package com.meet.markmeetadmin.controller;

import com.github.pagehelper.PageInfo;
import com.meet.markmeetadmin.model.entity.User;
import com.meet.markmeetadmin.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author LianQianChao
 */
@RestController
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public PageInfo<User> getAllUserByPage(@RequestParam(value = "page",defaultValue = "1") int page,
                                           @RequestParam(value = "offset",defaultValue = "10") int offset) {
        return userService.getAllUserByPage(page, offset);
    }


}
