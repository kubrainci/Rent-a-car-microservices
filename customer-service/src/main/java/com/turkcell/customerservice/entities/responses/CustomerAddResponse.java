package com.turkcell.customerservice.entities.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerAddResponse {

    private Integer id;
    private String name;
    private String lastName;
    private String username;
    private String email;
}
