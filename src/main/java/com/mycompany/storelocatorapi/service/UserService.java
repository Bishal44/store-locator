package com.mycompany.storelocatorapi.service;

import com.mycompany.storelocatorapi.exception.BusinessException;
import com.mycompany.storelocatorapi.model.UserModel;

public interface UserService {
    public boolean login(UserModel userModel) throws BusinessException;
}
