package com.stackroute.controller;

import com.stackroute.domain.User;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * RestController annotation is used to create Restful web services using Spring MVC
 */
@RestController

/**
 * RequestMapping annotation maps HTTP requests to handler methods
 */
@RequestMapping(value = "api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Constructor based Dependency injection to inject TrackService into controller
     */

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * PostMapping Annotation for mapping HTTP POST requests onto specific handler methods.
     */
    @PostMapping("/send")
    public String sendUserInfo(@RequestBody User user) throws Exception {
        userService.sendUserInfo(user);
        return "User details Sent Successfully";
    }

}
