package com.restarurant.order.application.services.impl;

import com.restarurant.order.application.services.ICustomerService;
import com.restarurant.order.domain.entities.Customer;
import com.restarurant.order.domain.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements ICustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Optional<Customer> createNewCustomer(Customer customer) {
        return Optional.ofNullable(customer)
                .map(customerRepository::save);
    }
}
