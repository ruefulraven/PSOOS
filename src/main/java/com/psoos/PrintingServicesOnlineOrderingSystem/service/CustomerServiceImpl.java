package com.psoos.PrintingServicesOnlineOrderingSystem.service;

import com.psoos.PrintingServicesOnlineOrderingSystem.dto.CustomerDto;
import com.psoos.PrintingServicesOnlineOrderingSystem.entity.Customer;
import com.psoos.PrintingServicesOnlineOrderingSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(CustomerDto customerDto) {
        Customer customer = new Customer(customerDto);
        return customerRepository.save(customer);
    }
}
