package com.restarurant.order.application.controllers;


import com.restarurant.order.application.services.impl.OrderPublisherImpl;
import com.restarurant.order.infractructure.dto.response.MessageDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/publishers")
@RequiredArgsConstructor

public class PublishController {

    private final OrderPublisherImpl publisher;


    @PostMapping
    public ResponseEntity<String> send(@Valid @RequestBody MessageDto dto) {
        if (dto == null) {
            return ResponseEntity.badRequest().body("DTO fue null");
        }
        publisher.publish(dto);
        return ResponseEntity.accepted().body("Mensaje enviado a RabbitMQ");
    }
}
