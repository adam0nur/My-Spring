package com.example.entity;

import javax.persistence.*;

@Entity
public class students {

    @Id
    private Long id;

    private String firstName;

    private String lastName;
    private String email;

}
