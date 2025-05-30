package com.restarurant.order.infractructure.dto.response;

import com.restarurant.order.domain.entities.OrderItem;
import com.restarurant.order.domain.valueobjects.DeliveryAddress;
import com.restarurant.order.domain.valueobjects.OrderAmountTotal;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ResponseDTO {

    private String orderId;
    private String username;
    private String email;
    private List<OrderItem> orderItems;
    private DeliveryAddress deliveryAddress;
    private OrderAmountTotal orderAmount;
    private String orderStatus;
}
