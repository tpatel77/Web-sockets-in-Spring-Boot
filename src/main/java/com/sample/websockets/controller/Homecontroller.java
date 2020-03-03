package com.sample.websockets.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.sample.websockets.model.User;
import com.sample.websockets.model.UserResponse;

@Controller
public class Homecontroller {
	@MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user) {

        return new UserResponse("Hi " + user.getName());
    }

}
