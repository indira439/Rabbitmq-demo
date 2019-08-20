package com.stackroute.service;

import com.stackroute.domain.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Service indicates annotated class is a service which hold business logic in the Service layer
 */
@Service
public class UserService {


    /**
     * Constructor based Dependency injection to inject AmqpTemplate here
     */
    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * @Value injects values into fields
     */
    @Value("${jsa.rabbitmq.exchange}")
    private String exchange;

    @Value("${jsa.rabbitmq.routingkey}")
    private String routingKey;

    public void sendUserInfo(User user) throws Exception{
        amqpTemplate.convertAndSend(exchange, routingKey, user);
    }
}
