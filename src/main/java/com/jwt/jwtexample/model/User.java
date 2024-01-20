package com.jwt.jwtexample.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class User {
    private String UserId;
    private String name;
    private String email;

    public User(String userId, String name, String email) {
        UserId = userId;
        this.name = name;
        this.email = email;
    }
}
