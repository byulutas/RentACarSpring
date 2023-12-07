package com.tobeto.spring.b.services.dtos.rentalCarDtos.rentalCarRequests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteRentalCarRequest {

    @NotNull
    @Min(1)
    private int rentalCarId;

}
