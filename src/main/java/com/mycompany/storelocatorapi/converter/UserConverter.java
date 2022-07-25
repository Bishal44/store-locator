package com.mycompany.storelocatorapi.converter;

import com.mycompany.storelocatorapi.entity.UserEntity;
import com.mycompany.storelocatorapi.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserEntity convertModelToEntity(UserModel userModel){
        UserEntity userEntity= new UserEntity();

        userEntity.setEmail(userModel.getEmail());
        userEntity.setFullName(userModel.getFullName());
        userEntity.setPassword(userModel.getPassword());
        userEntity.setMobileNumber(userModel.getMobileNumber());

        return userEntity;
    }


}
