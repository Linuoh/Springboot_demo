package com.example.spring.controller;

import com.example.spring.dto.request.SignInRequest;
import com.example.spring.dto.request.SignUpRequest;
import com.example.spring.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class LoginController {

    @PostMapping("/signIn")
    public Result signIn(@RequestBody SignInRequest request) {
        System.out.println("用户登录成功");
        return Result.ok(request);
    }

    @PostMapping("/signUp")
    public Result signUp(@RequestBody SignUpRequest request) {
        System.out.println("用户注册成功");
        return Result.ok(request);
    }
}
