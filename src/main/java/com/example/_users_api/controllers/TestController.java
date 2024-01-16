package com.example._users_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getTest(){
        return "A test of the Controller that we are using for a seperate branch";
    }


}
