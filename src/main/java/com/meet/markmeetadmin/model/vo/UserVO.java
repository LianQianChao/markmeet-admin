package com.meet.markmeetadmin.model.vo;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author LianQianChao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UserVO {

    @NotNull(message = "用户账号不能为空")
    private String username;

    @NotNull(message = "用户密码不能为空")
    @Size(min = 6,message = "密码长度必须大于等于6")
    private String password;
}
