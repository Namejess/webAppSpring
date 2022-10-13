package com.openclassrooms.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {

    private Integer id;

    private String firstName;

    private String lastName;

    private String mail;

    private String password;

}