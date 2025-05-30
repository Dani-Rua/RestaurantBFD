package com.restarurant.order.application.services;

import com.restarurant.order.domain.entities.Customer;

import java.util.Optional;

public interface ICustomerService {

    Optional<Customer> createNewCustomer(Customer customer);
}
