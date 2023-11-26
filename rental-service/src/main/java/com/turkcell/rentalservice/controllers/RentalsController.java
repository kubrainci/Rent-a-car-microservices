package com.turkcell.rentalservice.controllers;

import com.turkcell.rentalservice.entities.dtos.requests.CreateRentalRequestDto;
import com.turkcell.rentalservice.services.abstracts.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/rentals")
@RestController
@RequiredArgsConstructor
 public class RentalsController {
  private final RentalService rentalService;

  @GetMapping("/submitRental")
  public String submitRental(@RequestParam String inventoryCode) {

    return rentalService.submitRental(inventoryCode);
  }

}
