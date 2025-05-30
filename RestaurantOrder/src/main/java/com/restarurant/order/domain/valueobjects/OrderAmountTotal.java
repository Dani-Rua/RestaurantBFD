package com.restarurant.order.domain.valueobjects;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class OrderAmountTotal {

    @Field(name = "amount")
    private double amount;
}
