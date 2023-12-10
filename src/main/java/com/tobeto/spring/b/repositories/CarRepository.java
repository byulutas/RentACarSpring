package com.tobeto.spring.b.repositories;

import com.tobeto.spring.b.entities.Car;
import com.tobeto.spring.b.services.dtos.carDtos.carResponse.lists.CarListDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Integer> {

    @Query("SELECT new com.tobeto.spring.b.services.dtos.carDtos.carResponse.lists.CarListDto(c.modelYear, c.colorId,c.colorName,c.brandId ,c.brandName) FROM Cars m WHERE LOWER(c.modelName) LIKE CONCAT('%', LOWER(:modelName), '%')")
    List<CarListDto> findByModelNameLikeIgnoreCase(String modelName);
}
