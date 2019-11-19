package com.rainbow.user.api;

import com.rainbow.user.model.RainbowUser;
import com.rainbow.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：rainbow_cloud
 * 类 名 称：UserController
 * 类 描 述：TODO
 * 创建时间：2019-11-19 13:18
 * 创 建 人：leozheng
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/start")
    public RainbowUser startApi() {
        RainbowUser user = service.selectUser();
        return user;
    }

}
