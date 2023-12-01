package com.turkcell.customerservice.entities.requests;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class CustomerUpdateRequest {

    private String name;
    private String lastname;
    private String userName;
    private String password;
    private String email;



}
