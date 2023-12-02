package com.turkcell.rentalservice.entities.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RentalUpdateResponse {

    LocalDate rentalDate;
    private String inventoryCode;

}
