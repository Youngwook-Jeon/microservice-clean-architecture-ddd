package com.project.young.restaurant.service.domain.ports.output.message.publisher;

import com.project.young.domain.event.publisher.DomainEventPublisher;
import com.project.young.restaurant.service.domain.event.OrderApprovedEvent;

public interface OrderApprovedMessagePublisher extends DomainEventPublisher<OrderApprovedEvent> {
}
