package com.tobeto.spring.b.services.dtos.colorDtos.colorResponse.gets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetColorDto {
	
	private int colorId;
	private String colorName;

}
