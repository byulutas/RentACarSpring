package com.tobeto.spring.b.controllers;

import com.tobeto.spring.b.entities.Customer;
import com.tobeto.spring.b.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CustomersController {
    private final CustomerRepository customerRepository;
    // final => ctor blok dışında set edemezsiniz.
    public CustomersController(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }

    // Spring IoC container

    @GetMapping
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
    @GetMapping("{id}")
    public Customer getById(@PathVariable int id)
    {
        // Optional<T> => ilgili filtreden bir veri dönmeyebilir
        return customerRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public void add(@RequestBody Customer customer){
        customerRepository.save(customer);
    }
    @PutMapping
    public void update(@RequestBody Customer customer) {
        customerRepository.findById(customer.getId()).orElseThrow();
        customerRepository.save(customer);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id)
    {
        // kod buraya geliyor ise exception fırlamamıştır..
        //Brand brandToDelete = brandRepository.findById(id).orElseThrow();
        // özel kontroller
        //brandRepository.delete(brandToDelete);
        customerRepository.deleteById(id);
    }
}
