package com.example.jianshu.service;

import com.example.jianshu.entity.LoginUser;
import com.example.jianshu.entity.SysUser;
import com.example.jianshu.utils.ResponseUtil;

import java.util.List;

/**
 * Created by guocui on 2018/10/22.
 */
public interface SysUserService {
    ResponseUtil userLogin(LoginUser loginUser);
    List<SysUser> getHotUsers();
}
