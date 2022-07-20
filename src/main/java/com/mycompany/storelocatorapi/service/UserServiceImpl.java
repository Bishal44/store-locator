package com.mycompany.storelocatorapi.service;

import com.mycompany.storelocatorapi.entity.UserEntity;
import com.mycompany.storelocatorapi.model.UserModel;
import com.mycompany.storelocatorapi.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserEntityRepository userEntityRepository; //injekt in memory with this var name of userserviceimple
    @Override
    public void login(UserModel userModel) {


    }
}
