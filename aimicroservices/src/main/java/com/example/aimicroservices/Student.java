package com.example.aimicroservices;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Student {

    @GeneratedValue
    @Id

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer schoolid;

}
