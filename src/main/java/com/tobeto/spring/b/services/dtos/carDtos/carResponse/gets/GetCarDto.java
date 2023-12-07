package com.tobeto.spring.b.services.dtos.carDtos.carResponse.gets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCarDto {

	private int carId;
	private int modelYear;
	private  String modelName;
	private String colorName;
	private String brandName;

}
