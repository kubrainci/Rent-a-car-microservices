package com.turkcell.customerservice.controllers;

import com.turkcell.customerservice.entities.requests.CustomerAddRequest;
import com.turkcell.customerservice.entities.requests.CustomerUpdateRequest;
import com.turkcell.customerservice.entities.responses.CustomerAddResponse;
import com.turkcell.customerservice.entities.responses.CustomerGetResponse;
import com.turkcell.customerservice.entities.responses.CustomerUpdateResponse;
import com.turkcell.customerservice.services.abstracts.CustomerService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.ws.rs.POST;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/customers")
@RequestMapping
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;


    @PostMapping
    public CustomerAddResponse register(@RequestBody CustomerAddRequest request){
        return customerService.register(request);
    }

    @DeleteMapping
    public void delete(@RequestParam int id){
        customerService.delete(id);
    }

    @PutMapping
    public CustomerUpdateResponse update(@RequestParam int id,@RequestBody CustomerUpdateRequest request){
        return customerService.update(id, request);
    }

    @GetMapping("/getAll")
    public List<CustomerGetResponse> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/getById")
    public CustomerGetResponse getById(int id){
        return customerService.getById(id);
    }

    @PostMapping("/balanceUp")
    public double balanceUp(@RequestParam int customerId,@RequestParam double balance){
        return customerService.balanceUp(customerId,balance);
    }

    @PostMapping("/balanceDown")
    public double balanceDown(@RequestParam int customerId,@RequestParam double balance){
        return customerService.balanceDown(customerId, balance);
    }

    @GetMapping("/getBalanceByCustomerId")
    public double getBalanceByCustomerId (@RequestParam int customerId) {
        return customerService.getBalanceByCustomerId(customerId);
    }
}
