package com.turkcell.customerservice.services.concretes;

import com.turkcell.customerservice.entities.Customer;
import com.turkcell.customerservice.entities.requests.CustomerAddRequest;
import com.turkcell.customerservice.entities.requests.CustomerUpdateRequest;
import com.turkcell.customerservice.entities.responses.CustomerAddResponse;
import com.turkcell.customerservice.entities.responses.CustomerGetResponse;
import com.turkcell.customerservice.entities.responses.CustomerUpdateResponse;
import com.turkcell.customerservice.repositories.CustomerRepository;
import com.turkcell.customerservice.services.abstracts.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerManager implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Override
    public CustomerAddResponse register(CustomerAddRequest request) {
        Customer customerForAutoMapping = modelMapper.map(request, Customer.class);
        customerForAutoMapping = customerRepository.save(customerForAutoMapping);
        CustomerAddResponse customerAddResponse =
                modelMapper.map(customerForAutoMapping, CustomerAddResponse.class);
        return customerAddResponse;
    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public CustomerUpdateResponse update(int id, CustomerUpdateRequest request) {
        Customer customer = customerRepository.getReferenceById(id);
        modelMapper.map(request,customer);
        customer = customerRepository.save(customer);

        CustomerUpdateResponse customerUpdateResponse =
                modelMapper.map(customer, CustomerUpdateResponse.class);
        return customerUpdateResponse;
    }

    @Override
    public List<CustomerGetResponse> getAll() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerGetResponse> customerGetResponses =
                customers.stream().map(item -> modelMapper.map(item, CustomerGetResponse.class)).toList();
        return customerGetResponses;
    }

    @Override
    public CustomerGetResponse getById(int id) {
        Customer customer = customerRepository.getReferenceById(id);
        CustomerGetResponse customerGetResponse = modelMapper.map(customer, CustomerGetResponse.class);
        return customerGetResponse;
    }

    @Override
    public double getBalanceByCustomerId(int customerId) {
        Customer customer = customerRepository.getReferenceById(customerId);
        return customer.getBalance();
    }

    @Override
    public double balanceUp(int customerId, double balance) {
        Customer customer = customerRepository.getReferenceById(customerId);
        customer.setBalance(customer.getBalance() + balance);
        customer = customerRepository.save(customer);
        return customer.getBalance();
    }

    @Override
    public double balanceDown(int customerId, double balance) {
        Customer customer = customerRepository.getReferenceById(customerId);
        customer.setBalance(customer.getBalance() - balance);
        customer = customerRepository.save(customer);
        return customer.getBalance();
    }

}
