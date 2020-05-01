package org.chenguoyu.controller;


import org.chenguoyu.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("接口测试")
public class UserController {
    @PostMapping
    @ApiOperation(value = "测试接口", notes = "测试接口")
    public User getUser(@RequestBody User user) {
        return user;
    }
}
