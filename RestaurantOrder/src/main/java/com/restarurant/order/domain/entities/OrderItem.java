package com.restarurant.order.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class OrderItem {

    @Field(name = "name")
    private String name;

    @Field(name = "quantity")
    private int quantity;

    @Field(name = "price")
    private double price;

    public double calculateTotal() {
        return quantity * price;
    }
}
