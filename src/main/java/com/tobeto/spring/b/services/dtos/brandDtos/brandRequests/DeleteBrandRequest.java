package com.tobeto.spring.b.services.dtos.brandDtos.brandRequests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteBrandRequest {

    @NotNull
    @Min(1)
    private int brandId;

}
