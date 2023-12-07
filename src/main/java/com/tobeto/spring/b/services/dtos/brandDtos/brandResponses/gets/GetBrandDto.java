package com.tobeto.spring.b.services.dtos.brandDtos.brandResponses.gets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBrandDto {
	
	private int brandId;
	private String brandName;

}
