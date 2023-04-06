package com.psoos.PrintingServicesOnlineOrderingSystem.entity;

import com.psoos.PrintingServicesOnlineOrderingSystem.dto.CustomerDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Customer(CustomerDto customer){
        this.customerId = customer.getCustomerId();
        this.customerName = customer.getCustomerName();
        this.customerEmail = customer.getCustomerEmail();
        this.customerPhoneNumber = customer.getCustomerPhoneNumber();
    }
}
