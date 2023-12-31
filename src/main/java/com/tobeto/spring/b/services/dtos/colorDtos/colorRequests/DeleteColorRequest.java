package com.tobeto.spring.b.services.dtos.colorDtos.colorRequests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteColorRequest {

	@NotNull
	@Min(1)
	private int colorId;
	
}
