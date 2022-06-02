package com.project.young.order.service.domain.ports.output.message.publisher.payment;

import com.project.young.domain.event.publisher.DomainEventPublisher;
import com.project.young.order.service.domain.event.OrderCancelledEvent;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
