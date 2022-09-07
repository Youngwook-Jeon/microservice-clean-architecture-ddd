package com.project.young.order.service.domain;

import com.project.young.domain.event.publisher.DomainEventPublisher;
import com.project.young.order.service.domain.entity.Order;
import com.project.young.order.service.domain.entity.Restaurant;
import com.project.young.order.service.domain.event.OrderCancelledEvent;
import com.project.young.order.service.domain.event.OrderCreatedEvent;
import com.project.young.order.service.domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String> failureMessages);
}
