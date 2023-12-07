package com.tobeto.spring.b.services.dtos.rentalCarDtos.rentalCarRequests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRentalCarRequest {

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate finishDate;

    @NotNull
    @Min(1)
    private int carId;

    @NotNull
    @Min(1)
    private int rented_kilometer;

    @NotNull
    @Min(1)
    private int delivered_kilometer;

    @NotNull
    @Min(1)
    private int customerId;

}