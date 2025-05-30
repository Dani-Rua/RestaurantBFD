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

public class DeliveryAddress {

    @Field(name = "street")
    private String street;

    @Field(name = "city")
    private String city;
}
