package com.restarurant.order.application.services;


import com.restarurant.order.domain.entities.Order;

import java.util.Optional;

public interface IOrderService {

   Optional<Order> createNewOrder(Order order);
   Optional<Order> updateOrder(String id, Order updateOrder);
}
