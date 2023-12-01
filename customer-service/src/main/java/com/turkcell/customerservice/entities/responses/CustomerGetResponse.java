package com.turkcell.customerservice.entities.responses;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerGetResponse {

     private String name;
     private String lastname;
     private String userName;

}
