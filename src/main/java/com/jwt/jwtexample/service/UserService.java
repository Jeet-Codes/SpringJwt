package com.jwt.jwtexample.service;


import com.jwt.jwtexample.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Sandeep Kumar","sandeep@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Bikash malu","Bikash@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Zaheer Khan","Zaheer@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Deppak Barikee","Deepak@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}

