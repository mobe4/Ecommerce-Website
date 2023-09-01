package com.example.usermeteadata.Repository;

import com.example.usermeteadata.Entity.MetaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface UserRepo extends JpaRepository<MetaData,Long> {

    MetaData save(MetaData metaData);

    MetaData findByUniqueId(String userID);


}
