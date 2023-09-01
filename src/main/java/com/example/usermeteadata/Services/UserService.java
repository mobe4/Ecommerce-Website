package com.example.usermeteadata.Services;

import com.example.usermeteadata.Entity.MetaData;
import com.example.usermeteadata.Repository.UserRepo;
import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo ;


    public MetaData saveUserMetaDataToDb(MetaData metaData){


        return  userRepo.save(metaData);

    }

    public MetaData getMetaData(String userId){

        return   userRepo.findByUniqueId(userId);

    }
}
