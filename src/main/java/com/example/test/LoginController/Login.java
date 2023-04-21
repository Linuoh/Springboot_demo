package com.example.test.LoginController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // 检查用户名和密码是否有效
        if (isValid(username, password)) {
            return "登录成功";
        } else {
            return "用户名或密码无效";
        }
    }

    @GetMapping("/user")
    public String getUser() {
        // 实现自己的逻辑来获取用户信息
        // 在这里，我们只返回硬编码的用户信息
        return "用户名：admin，密码：123456";
    }

    private boolean isValid(String username, String password) {
        // 实现自己的逻辑来检查用户名和密码是否有效
        // 例如，您可以检查数据库或硬编码的用户列表
        // 在这里，我们只检查用户名是否为“admin”且密码是否为“password”
        return username.equals("admin") && password.equals("123456");
    }
}
