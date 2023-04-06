package com.psoos.PrintingServicesOnlineOrderingSystem.service;

import com.psoos.PrintingServicesOnlineOrderingSystem.dto.CustomerDto;
import com.psoos.PrintingServicesOnlineOrderingSystem.entity.Customer;

public interface CustomerService {

    public Customer saveCustomer(CustomerDto customer);
}
