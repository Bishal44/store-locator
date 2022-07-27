package com.mycompany.storelocatorapi.service;

import com.mycompany.storelocatorapi.constant.ErrorType;
import com.mycompany.storelocatorapi.entity.UserEntity;
import com.mycompany.storelocatorapi.exception.BusinessException;
import com.mycompany.storelocatorapi.exception.ErrorModel;
import com.mycompany.storelocatorapi.model.UserModel;
import com.mycompany.storelocatorapi.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserEntityRepository userEntityRepository; //injekt in memory with this var name of userserviceimple
    @Override
    public boolean login(UserModel userModel) throws BusinessException {
     UserEntity userEntity=userEntityRepository.findByEmailAndPassword(userModel.getEmail(),userModel.getPassword());

     boolean result = false;
     if(userEntity == null){

         List<ErrorModel> errorList= new ArrayList<>();
         ErrorModel errorModel= new ErrorModel();
         errorModel.setCode(ErrorType.AUTH_INVALID_CREDENTIALS.toString());
         errorModel.setMessage("Incorrect email or password");

         errorList.add(errorModel);
         throw new BusinessException(errorList);

     }
     else {
         result= true;
     }
     return result;

    }
}
