package com.tobeto.spring.b.services.abstracts;

import com.tobeto.spring.b.services.dtos.carDtos.carRequests.CreateCarRequest;
import com.tobeto.spring.b.services.dtos.carDtos.carRequests.UpdateCarRequest;
import com.tobeto.spring.b.services.dtos.carDtos.carResponse.gets.GetCarDto;
import com.tobeto.spring.b.services.dtos.carDtos.carResponse.lists.CarListDto;

import java.util.List;

public interface CarService {
    List<CarListDto> getAll();
    GetCarDto getById(int id);
    void add (CreateCarRequest request);
    void update (int id, UpdateCarRequest updateCar);
    void delete (int id);
    List<CarListDto> search (String modelName);
}
