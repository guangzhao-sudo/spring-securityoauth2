package com.guangzhao.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Usercontroller {
    @RequestMapping("get")
    public Object get(Authentication authentication){
        return authentication.getPrincipal();
    }
}
