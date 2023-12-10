package com.tobeto.spring.b.services.concretes;

import com.tobeto.spring.b.services.abstracts.CarService;
import com.tobeto.spring.b.services.dtos.carDtos.carRequests.CreateCarRequest;
import com.tobeto.spring.b.services.dtos.carDtos.carRequests.UpdateCarRequest;
import com.tobeto.spring.b.services.dtos.carDtos.carResponse.gets.GetCarDto;
import com.tobeto.spring.b.services.dtos.carDtos.carResponse.lists.CarListDto;

import java.util.List;

public class CarManager implements CarService {

    @Override
    public List<CarListDto> getAll() {
        return null;
    }

    @Override
    public GetCarDto getById(int id) {
        return null;
    }

    @Override
    public void add(CreateCarRequest createCarRequest) {
        if (createCarRequest.getModelName().length() < 2)
            throw new RuntimeException("Ad 2 karakterden kısa olamaz.");

    }

    @Override
    public void update(int id, UpdateCarRequest updateCar) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<CarListDto> search(String modelName) {
        return null;
    }
}
