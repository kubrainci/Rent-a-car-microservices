package com.turkcell.customerservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/customers")
@RequestMapping
@RequiredArgsConstructor
public class CustomerController {

      @GetMapping()
      public String deneme(){
          return "deneme";
      }
}
