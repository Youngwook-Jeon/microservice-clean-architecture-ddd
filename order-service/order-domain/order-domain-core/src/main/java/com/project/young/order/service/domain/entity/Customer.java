package com.project.young.order.service.domain.entity;

import com.project.young.domain.entity.AggregateRoot;
import com.project.young.domain.valueobject.CustomerId;

public class Customer extends AggregateRoot<CustomerId> {

    public Customer() {
    }

    public Customer(CustomerId customerId) {
        super.setId(customerId);
    }
}
