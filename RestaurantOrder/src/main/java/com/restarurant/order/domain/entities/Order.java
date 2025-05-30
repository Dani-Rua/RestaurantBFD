package com.restarurant.order.domain.entities;


import com.restarurant.order.domain.enums.OrderStatus;
import com.restarurant.order.domain.valueobjects.DeliveryAddress;
import com.restarurant.order.domain.valueobjects.OrderAmountTotal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "orders")
public class Order {

    @Id
    private String orderId;
    private Customer customer;
    private List<OrderItem> orderItems;
    private DeliveryAddress deliveryAddress;

    @Field(name = "orderAmount")
    private OrderAmountTotal orderAmount;
    private OrderStatus orderStatus;
}
