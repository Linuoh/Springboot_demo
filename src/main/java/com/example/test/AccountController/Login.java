package com.example.test.AccountController;

import com.example.test.Result.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
public class Login {

    @PostMapping("/login")
    public Result login(@RequestBody Account account) {
        // 检查用户名和密码是否有效
        if (isValid(account.getUsername(), account.getPassword())) {
            return Result.ok("登录成功");
        } else {
            return Result.fail();
        }
    }

    private boolean isValid(String username, String password) {
        // 实现自己的逻辑来检查用户名和密码是否有效
        // 例如，您可以检查数据库或硬编码的用户列表
        // 在这里，我们只检查用户名是否为“admin”且密码是否为“password”
        return username.equals("admin") && password.equals("123456");
    }

    @GetMapping("/user")
    public Result<Map<String, String>> getUser() throws JsonProcessingException {
        Map<String, String> data = new HashMap<>();
        data.put("username", "admin");
        data.put("password", "123456");
        return Result.ok(data);
    }
}