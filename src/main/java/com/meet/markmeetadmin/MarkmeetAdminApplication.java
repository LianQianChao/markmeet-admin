package com.meet.markmeetadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@MapperScan("com.meet.markmeetadmin.mapper")
public class MarkmeetAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarkmeetAdminApplication.class, args);
    }

}
