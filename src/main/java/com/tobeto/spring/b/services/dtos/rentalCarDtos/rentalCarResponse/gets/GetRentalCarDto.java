package com.tobeto.spring.b.services.dtos.rentalCarDtos.rentalCarResponse.gets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetRentalCarDto {

    private int rentalCarId;
    private LocalDate startDate;
    private LocalDate finishDate;
    private int carId;
    private String brandName;
    private String colorName;
    private Integer rentedKilometer;
    private Integer deliveredKilometer;

}
