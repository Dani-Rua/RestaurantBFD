package com.restarurant.order.application.services.impl;

import com.restarurant.order.application.services.IOrderPublisherService;
import com.restarurant.order.infractructure.config.RabbitConfig;
import com.restarurant.order.infractructure.dto.response.MessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class OrderPublisherImpl implements IOrderPublisherService {

    private final RabbitTemplate rabbitTamplate;

    @Override
    public void publish(MessageDto message) {
        if (message == null || message.getIngrediente_id() == null || message.getCantidad() <= 0) {
            throw new IllegalArgumentException("Invalid message data");
        }
        rabbitTamplate.convertAndSend(
                RabbitConfig.EXCHANGE,
                RabbitConfig.ROUTING_KEY,
                message
        );
    }
}
