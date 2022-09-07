package com.project.young.order.service.domain.event;

import com.project.young.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderPaidEvent extends OrderEvent {

    public OrderPaidEvent(Order order,
                          ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
