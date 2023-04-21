package com.example.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class test {
    @GetMapping("/myGetEndpoint")
    public String handleGetRequest() {
        // Code to handle GET request
        return "This is a GET request";
    }

    @PostMapping("/myPostEndpoint")
    public String handlePostRequest() {
        // Code to handle POST request
        return "This is a POST request";
    }
}
