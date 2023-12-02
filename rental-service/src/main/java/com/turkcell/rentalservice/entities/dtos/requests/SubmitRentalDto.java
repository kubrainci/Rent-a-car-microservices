package com.turkcell.rentalservice.entities.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubmitRentalDto {

    private String inventoryCode;
    private int customerId;
    private LocalDate endDate;

}
