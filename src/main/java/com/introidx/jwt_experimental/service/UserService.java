package com.introidx.jwt_experimental.service;

import com.introidx.jwt_experimental.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService(){
        users.add(User.builder().userId("1").name("introidx").email("abc").build());
        users.add(User.builder().userId("2").name("abc").email("abc").build());
        users.add(User.builder().userId("3").name("def").email("abc").build());
    }

    public List<User> getUsers(){
        return users;
    }
}
