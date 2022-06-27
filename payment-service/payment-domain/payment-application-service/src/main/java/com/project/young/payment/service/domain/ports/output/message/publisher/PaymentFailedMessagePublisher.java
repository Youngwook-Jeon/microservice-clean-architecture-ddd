package com.project.young.payment.service.domain.ports.output.message.publisher;

import com.project.young.domain.event.publisher.DomainEventPublisher;
import com.project.young.payment.service.domain.event.PaymentFailedEvent;

public interface PaymentFailedMessagePublisher extends DomainEventPublisher<PaymentFailedEvent> {
}
