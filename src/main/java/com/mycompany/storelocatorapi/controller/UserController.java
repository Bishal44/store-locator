package com.mycompany.storelocatorapi.controller;

import com.mycompany.storelocatorapi.exception.BusinessException;
import com.mycompany.storelocatorapi.model.UserModel;
import com.mycompany.storelocatorapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Boolean> login(@RequestBody UserModel userModel) throws BusinessException {    //to capture data annotAtion



          boolean result= userService.login(userModel);

         ResponseEntity<Boolean> booleanResponseEntity=new ResponseEntity<>(result, HttpStatus.OK);

        return booleanResponseEntity;
}
}
/*
instead of throwing business exception we can handle try catch like this

public ResponseEntity<Boolean> login(@RequestBody UserModel userModel) {    //to capture data annotAtion

        ResponseEntity<Boolean> booleanResponseEntity = null;
        try {

          boolean result= userService.login(userModel);

              booleanResponseEntity=new ResponseEntity<>(result, HttpStatus.OK);


    }catch(BusinessException businessException){

    }
        return booleanResponseEntity;
}
}*/