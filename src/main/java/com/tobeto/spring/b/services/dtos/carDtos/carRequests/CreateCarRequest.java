package com.tobeto.spring.b.services.dtos.carDtos.carRequests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
	

	@NotNull
	@Min(1900)
	private int modelYear;
	
	private String modelName;


	@NotNull
	@Min(1)
	private int brandId;
	
	@NotNull
	@Min(1)
	private int colorId;
	
}
