package com.sofyan.rabbitmicro;

import com.sofyan.rabbitmicro.CustomMessage;
import com.sofyan.rabbitmicro.MQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }
}