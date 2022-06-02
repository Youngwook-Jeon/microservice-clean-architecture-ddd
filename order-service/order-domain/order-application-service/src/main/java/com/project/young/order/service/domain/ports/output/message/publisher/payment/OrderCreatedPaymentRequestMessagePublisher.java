package com.project.young.order.service.domain.ports.output.message.publisher.payment;

import com.project.young.domain.event.publisher.DomainEventPublisher;
import com.project.young.order.service.domain.event.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
