package com.example.jianshu.entity;

import lombok.Builder;
import lombok.Data;

/**
 * Created by guocui on 2018/10/22.
 */
@Data
@Builder
public class LoginUser {
    private String email;
    private String password;
}
