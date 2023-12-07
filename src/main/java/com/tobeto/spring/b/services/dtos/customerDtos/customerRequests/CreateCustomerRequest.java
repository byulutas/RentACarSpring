package com.tobeto.spring.b.services.dtos.customerDtos.customerRequests;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest {

    @JsonIgnore
    @CreationTimestamp
    private LocalDate registrationDate;

}
