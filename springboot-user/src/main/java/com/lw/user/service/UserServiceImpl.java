package com.lw.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lw.entity.UserEntity;
import com.lw.facade.user.UserService;
import com.lw.req.user.LoginReq;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity login(LoginReq loginReq) {
        return null;
    }
}
