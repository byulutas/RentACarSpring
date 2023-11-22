package com.tobeto.spring.b.controllers;

import com.tobeto.spring.b.entities.RentalCar;
import com.tobeto.spring.b.repositories.RentalCarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RentalCarsController {
    private final RentalCarRepository rentalCarRepository;
    // final => ctor blok dışında set edemezsiniz.
    public RentalCarsController(RentalCarRepository rentalCarRepository)
    {
        this.rentalCarRepository = rentalCarRepository;

    }

    // Spring IoC container

    @GetMapping
    public List<RentalCar> getAll() {
        return rentalCarRepository.findAll();
    }
    @GetMapping("{id}")
    public RentalCar getById(@PathVariable int id)
    {
        // Optional<T> => ilgili filtreden bir veri dönmeyebilir
        return rentalCarRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public void add(@RequestBody RentalCar rentalCar){
        rentalCarRepository.save(rentalCar);
    }
    @PutMapping
    public void update(@RequestBody RentalCar rentalCar) {
        rentalCarRepository.findById(rentalCar.getId()).orElseThrow();
        rentalCarRepository.save(rentalCar);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id)
    {
        // kod buraya geliyor ise exception fırlamamıştır..
        //Brand brandToDelete = brandRepository.findById(id).orElseThrow();
        // özel kontroller
        //brandRepository.delete(brandToDelete);
        rentalCarRepository.deleteById(id);
    }
}
