package com.turkcell.rentalservice.entities.dtos.requests;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rentals")
@Builder


public class CreateRentalRequestDto {

}
