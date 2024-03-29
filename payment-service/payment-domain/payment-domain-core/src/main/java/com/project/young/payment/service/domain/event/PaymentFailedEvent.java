package com.project.young.payment.service.domain.event;

import com.project.young.domain.event.publisher.DomainEventPublisher;
import com.project.young.payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.List;

public class PaymentFailedEvent extends PaymentEvent {

    public PaymentFailedEvent(
            Payment payment,
            ZonedDateTime createdAt,
            List<String> failureMessages) {
        super(payment, createdAt, failureMessages);
    }

}
