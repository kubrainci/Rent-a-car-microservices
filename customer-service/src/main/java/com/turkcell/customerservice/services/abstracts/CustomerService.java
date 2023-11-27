package com.turkcell.customerservice.services.abstracts;

import com.turkcell.customerservice.entities.requests.CustomerAddRequest;
import com.turkcell.customerservice.entities.responses.CustomerAddResponse;

public interface CustomerService {

   CustomerAddResponse register(CustomerAddRequest request);

    double balanceUp(int customerId, double balance);

    double balanceDown(int customerId, double balance);

    double getBalanceByCustomerId(int customerId);
}
