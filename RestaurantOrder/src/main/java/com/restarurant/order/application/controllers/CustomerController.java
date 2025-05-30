package com.restarurant.order.application.controllers;

import com.restarurant.order.application.services.ICustomerService;
import com.restarurant.order.domain.entities.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final ICustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<Customer>  createcustomer(@RequestBody Customer request){
        return customerService.createNewCustomer(request)
                .map(customer -> ResponseEntity.ok().body(customer))
                .orElse(ResponseEntity.badRequest().build());
    }
}
