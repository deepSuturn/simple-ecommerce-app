package com.suturn.adapter.inbound.rest;

import com.suturn.application.port.UserServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usr/")
public class UserController {

    @Autowired
    UserServicePort userServicePort;

    @GetMapping("login")
    public void loginUser() {
        userServicePort.authenticateUser();
    }
}
