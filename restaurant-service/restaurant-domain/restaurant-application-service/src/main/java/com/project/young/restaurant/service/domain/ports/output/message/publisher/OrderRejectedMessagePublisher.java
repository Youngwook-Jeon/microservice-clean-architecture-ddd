package com.project.young.restaurant.service.domain.ports.output.message.publisher;

import com.project.young.domain.event.publisher.DomainEventPublisher;
import com.project.young.restaurant.service.domain.event.OrderRejectedEvent;

public interface OrderRejectedMessagePublisher extends DomainEventPublisher<OrderRejectedEvent> {
}
