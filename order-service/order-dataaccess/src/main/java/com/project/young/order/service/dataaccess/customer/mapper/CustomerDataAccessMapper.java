package com.project.young.order.service.dataaccess.customer.mapper;

import com.project.young.domain.valueobject.CustomerId;
import com.project.young.order.service.dataaccess.customer.entity.CustomerEntity;
import com.project.young.order.service.domain.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataAccessMapper {

    public Customer customerEntityToCustomer(CustomerEntity customerEntity) {
        return new Customer(new CustomerId(customerEntity.getId()));
    }
}
