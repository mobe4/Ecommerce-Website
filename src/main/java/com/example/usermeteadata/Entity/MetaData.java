package com.example.usermeteadata.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "metadata")
public class MetaData {

    @Id
     @GeneratedValue
    public Long id;

    public String name;
    public String uniqueId;
    public String email;


    public String getEmail() {
        return email;
    }
}
