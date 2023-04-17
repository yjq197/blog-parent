package com.yjq.blog.controller;

import com.yjq.blog.service.LoginService;
import com.yjq.blog.vo.Result;
import com.yjq.blog.vo.params.LoginParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;
    @PostMapping
    public Result login(@RequestBody LoginParams loginParams){
        return loginService.login(loginParams);

    }
}
