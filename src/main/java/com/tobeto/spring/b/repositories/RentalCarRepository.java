package com.tobeto.spring.b.repositories;


import com.tobeto.spring.b.entities.RentalCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalCarRepository extends JpaRepository<RentalCar,Integer> {
}

