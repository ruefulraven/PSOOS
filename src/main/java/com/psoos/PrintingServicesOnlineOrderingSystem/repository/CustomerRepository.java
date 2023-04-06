package com.psoos.PrintingServicesOnlineOrderingSystem.repository;

import com.psoos.PrintingServicesOnlineOrderingSystem.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
