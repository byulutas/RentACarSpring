package com.tobeto.spring.b.controllers;

import com.tobeto.spring.b.entities.Brand;
import com.tobeto.spring.b.entities.Color;
import com.tobeto.spring.b.repositories.BrandRepository;
import com.tobeto.spring.b.repositories.ColorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ColorsController {
    private final ColorRepository colorRepository;
    // final => ctor blok dışında set edemezsiniz.
    public ColorsController(ColorRepository colorRepository)
    {
        this.colorRepository = colorRepository;
    }

    // Spring IoC container

    @GetMapping
    public List<Color> getAll() {
        return colorRepository.findAll();
    }
    @GetMapping("{id}")
    public Color getById(@PathVariable int id)
    {
        // Optional<T> => ilgili filtreden bir veri dönmeyebilir
        return colorRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public void add(@RequestBody Color color){
        colorRepository.save(color);
    }
    @PutMapping
    public void update(@RequestBody Color color) {
        colorRepository.findById(color.getId()).orElseThrow();
        colorRepository.save(color);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id)
    {
        // kod buraya geliyor ise exception fırlamamıştır..
        //Brand brandToDelete = brandRepository.findById(id).orElseThrow();
        // özel kontroller
        //brandRepository.delete(brandToDelete);
        colorRepository.deleteById(id);
    }
}
