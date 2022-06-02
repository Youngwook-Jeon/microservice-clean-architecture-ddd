package com.project.young.order.service.domain.ports.output.message.publisher.restaurantapproval;

import com.project.young.domain.event.publisher.DomainEventPublisher;
import com.project.young.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
