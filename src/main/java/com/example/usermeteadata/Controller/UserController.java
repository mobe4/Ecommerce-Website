package com.example.usermeteadata.Controller;

import com.example.usermeteadata.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Meta;
import org.springframework.web.bind.annotation.*;

import com.example.usermeteadata.Entity.MetaData;

@RestController
@RequestMapping("lora/v1/customers/")
public class UserController {

    @Autowired
    UserService userService ;

    @PostMapping("saveDetails")
    public MetaData saveDetails (@RequestBody MetaData metaData){

        MetaData newUser = userService.saveUserMetaDataToDb(metaData);
         return newUser;
    }

    @GetMapping("getUserDetails/{userid}")
    public MetaData getUsersDetails(@PathVariable String userid){
        MetaData userIs = userService.getMetaData(userid);
        return  userIs ;
    }

}
