package com.wantup.controller;

import com.wantup.multi_datasource.service.impl.UserService01Impl;
import com.wantup.multi_datasource2.service.impl.UserService02Impl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author 赵洛伟
 * @since 2019-06-05
 */
@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService01Impl userService01;

    @Autowired
    private UserService02Impl userService02;

    @RequestMapping(value = "/inserUser")
    public String inserUser(String username, String password) {
        int insertUser = this.userService01.insertUser(username, password);
        if (insertUser > 0) {
            return "success";
        }else {
            return "fail";
        }

    }

    @RequestMapping(value = "/inserUser2")
    public String inserUser2(String username, String password) {
        int insertUser = this.userService02.insertUser(username, password);
        if (insertUser > 0) {
            return "success";
        }else {
            return "fail";
        }

    }

}
