package com.lw.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lw.entity.UserEntity;
import com.lw.facade.user.UserService;
import com.lw.req.user.LoginReq;
import com.lw.rsp.Result;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class UserControllerImpl implements UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {
        //登录鉴权
        UserEntity userEntity=userService.login(loginReq);
        return Result.newSuccessResult(userEntity);
    }
}
