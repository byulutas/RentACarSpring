package com.tobeto.spring.b.services.dtos.brandDtos.brandResponses.lists;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandListDto {
	
	private int brandId;
	private String brandName;

}
