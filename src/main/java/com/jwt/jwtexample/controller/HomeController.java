package com.jwt.jwtexample.controller;

import com.jwt.jwtexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
//    http://sandeep:8181/home/user
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List getuser(){
        System.out.println("Getting users");
        return this.userService.getUsers();
    }
    @GetMapping("/current-user")
    public String getLoggedUser(Principal principal){
        return principal.getName();
    }


}
