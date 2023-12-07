package com.tobeto.spring.b.services.dtos.carDtos.carResponse.lists;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarListDto {
	
	private int carId;
	private int modelYear;
	private int colorId;
	private String colorName;
	private int brandId;
	private String brandName;

}
