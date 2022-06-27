package com.project.young.payment.service.domain.ports.output.message.publisher;

import com.project.young.domain.event.publisher.DomainEventPublisher;
import com.project.young.payment.service.domain.event.PaymentCancelledEvent;

public interface PaymentCancelledMessagePublisher extends DomainEventPublisher<PaymentCancelledEvent> {
}
