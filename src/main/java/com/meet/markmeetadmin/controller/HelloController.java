package com.meet.markmeetadmin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author LianQianChao
 */
@Api(tags = "Hello")
@RestController
public class HelloController {

    @ApiOperation("HelloWorld")
    @GetMapping(path = "/hello")
    public Person hello(){

        return new Person("小米",12);
    }
}
