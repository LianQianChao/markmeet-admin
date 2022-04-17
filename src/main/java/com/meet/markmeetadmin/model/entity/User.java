package com.meet.markmeetadmin.model.entity;

import lombok.*;

import java.util.Date;

/**
 * @author LianQianChao
 */
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    private String username;

    private String nickname;

    private String password;

    private String email;

    private Integer enable;

    private Date create_time;

    private Date update_time;

    private String changer;
}
