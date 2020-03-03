package com.sample.websockets.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;

import com.sample.websockets.model.UserResponse;


@Configuration
public class Schedulerconfig {

	@Autowired
    SimpMessagingTemplate template;

    
    public void sendAdhocMessages() {
        template.convertAndSend("/topic/user", new UserResponse("Fixed Delay Scheduler"));
    }
}
