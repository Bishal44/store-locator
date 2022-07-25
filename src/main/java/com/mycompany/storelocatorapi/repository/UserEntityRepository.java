package com.mycompany.storelocatorapi.repository;

import com.mycompany.storelocatorapi.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends CrudRepository<UserEntity,Long> {
//Curd repo takes entity and primary key of entity
    public UserEntity findByEmailAndPassword(String email, String password);

}
