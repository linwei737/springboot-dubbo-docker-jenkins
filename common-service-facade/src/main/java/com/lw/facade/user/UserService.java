package com.lw.facade.user;

import com.lw.entity.UserEntity;
import com.lw.req.user.LoginReq;

public interface UserService {

    public UserEntity login(LoginReq loginReq);
}
