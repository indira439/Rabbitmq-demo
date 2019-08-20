package com.stackroute.service;

import com.stackroute.domain.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @Service indicates annotated class is a service which hold business logic in the Service layer
 */
@Service
public class UserService {

    /**
     * @RabbitListener to consume messages from queue produced by Producer
     */
    @RabbitListener(queues = "${jsa.rabbitmq.queue}")
    public void receivedMessage(User user) {
        System.out.println("Received =" + user);
    }
}
