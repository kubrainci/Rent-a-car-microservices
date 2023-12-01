package com.turkcell.customerservice.entities.responses;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerUpdateResponse {

    private String name;
    private String lastName;
    private String userName;
    private String email;

}
