package com.example.usermeteadata.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "User")
public class MetaData {

    @Id
     @GeneratedValue
    private Long bid;

    private String name;
    private String uniqueId;
    private String email;



}
