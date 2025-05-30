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
        if (message == null) {
            throw new IllegalArgumentException("El mensaje no puede ser nulo");
        }
        System.out.println("Enviando a RabbitMQ: " + message);
        System.out.println("Clase del objeto: " + message.getClass());
        rabbitTamplate.convertAndSend(
                RabbitConfig.EXCHANGE,
                RabbitConfig.ROUTING_KEY,
                message
        );
    }
}
