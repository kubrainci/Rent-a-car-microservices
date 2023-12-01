package com.turkcell.customerservice.services.abstracts;

import com.turkcell.customerservice.entities.requests.CustomerAddRequest;
import com.turkcell.customerservice.entities.requests.CustomerUpdateRequest;
import com.turkcell.customerservice.entities.responses.CustomerAddResponse;
import com.turkcell.customerservice.entities.responses.CustomerGetResponse;
import com.turkcell.customerservice.entities.responses.CustomerUpdateResponse;

import java.util.List;

public interface CustomerService {

    CustomerAddResponse register(CustomerAddRequest request);

    void delete(int id);

    CustomerUpdateResponse update(int id, CustomerUpdateRequest update);

    List<CustomerGetResponse> getAll();

    CustomerGetResponse getById(int id);

    double balanceUp(int customerId, double balance);

    double balanceDown(int customerId, double balance);

    double getBalanceByCustomerId(int customerId);

}
