package com.spring_cloud.RabbitMQ.consumer;

import com.spring_cloud.RabbitMQ.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class RabbitMqJsonConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMqJsonConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consumeJsonMessage(User user) {
        LOGGER.info(String.format("Received json message -> %s", user.toString()));
    }
}
