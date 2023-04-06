package com.psoos.PrintingServicesOnlineOrderingSystem.controller;

import com.psoos.PrintingServicesOnlineOrderingSystem.dto.CustomerDto;
import com.psoos.PrintingServicesOnlineOrderingSystem.entity.Customer;
import com.psoos.PrintingServicesOnlineOrderingSystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody CustomerDto customerDto){
        Customer customer = new Customer(customerDto);
        customerService.saveCustomer(customerDto);

        return "Customer Saved!: " + customer.toString();
    }
}
