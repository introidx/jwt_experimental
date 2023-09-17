package com.introidx.jwt_experimental.controller;

import com.introidx.jwt_experimental.entity.User;
import com.introidx.jwt_experimental.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
@AllArgsConstructor
public class HomeController {

    UserService userService;
    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getUsers();
    }

    @GetMapping("/current")
    public String getCurrent(Principal principal){
        return principal.getName();
    }


}
