package com.restarurant.order.application.services;

import com.restarurant.order.infractructure.dto.response.MessageDto;

public interface IOrderPublisherService {
    void publish(MessageDto message);
}
