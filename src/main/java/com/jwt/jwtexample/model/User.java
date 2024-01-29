package com.jwt.jwtexample.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String UserId;
    private String name;
    private String email;

}
