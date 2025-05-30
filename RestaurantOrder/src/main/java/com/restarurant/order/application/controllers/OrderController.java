package com.restarurant.order.application.controllers;


import com.restarurant.order.application.services.IOrderService;
import com.restarurant.order.domain.entities.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final IOrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(@RequestBody Order request) {
        return orderService.createNewOrder(request)
                .map(order -> ResponseEntity.ok().body(order))
                .orElse(ResponseEntity.badRequest().build());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable String id, @RequestBody Order updateOrder){
        return orderService.updateOrder(id, updateOrder)
                .map(order -> ResponseEntity.ok().body(order))
                .orElse(ResponseEntity.notFound().build());
    }
}
