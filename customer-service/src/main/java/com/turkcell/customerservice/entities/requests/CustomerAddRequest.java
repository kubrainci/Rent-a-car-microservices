package com.turkcell.customerservice.entities.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CustomerAddRequest {

    private String name;

    private String lastName;

    @NotBlank(message = "{userNameShouldNotBeEmpty}")
    private String username;

    @NotBlank(message = "{passwordShouldNotBeEmpty}")
    @Size(min = 8, max = 20, message = "{passwordShouldBeMinimumAndMaximum}")
    private String password;

    @NotBlank(message = "{emailShouldNotBeEmpty}")
    @Email(
            message = "emailIsNotValid.",
            regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    private String email;
}
