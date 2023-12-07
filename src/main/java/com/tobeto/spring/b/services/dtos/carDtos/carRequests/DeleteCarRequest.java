package com.tobeto.spring.b.services.dtos.carDtos.carRequests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteCarRequest {

	@NotNull
	@Min(1)
	private int carId;
	
}
