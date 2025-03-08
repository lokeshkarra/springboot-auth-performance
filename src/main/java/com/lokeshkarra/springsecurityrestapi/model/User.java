package com.lokeshkarra.springsecurityrestapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@Table(name = "app_user")  // changed here
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    @ManyToMany(targetEntity = Role.class)
    private Set<Role> roles;

}

