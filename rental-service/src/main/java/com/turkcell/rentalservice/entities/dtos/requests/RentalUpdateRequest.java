package com.turkcell.rentalservice.entities.dtos.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RentalUpdateRequest {

    LocalDate rentalDate;
    @NotNull(message = "inventoryCodeShouldNotBeLeftEmpty")
    private String inventoryCode;
}
