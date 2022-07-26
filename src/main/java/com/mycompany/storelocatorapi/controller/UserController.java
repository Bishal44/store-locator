package com.mycompany.storelocatorapi.controller;

import com.mycompany.storelocatorapi.model.UserModel;
import com.mycompany.storelocatorapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public void login(@RequestBody UserModel userModel){    //to capture data annotAtion
        userService.login(userModel);

    }


}
