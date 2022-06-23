package com.project.young.payment.service.domain.event;

import com.project.young.payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.List;

public class PaymentCancelledEvent extends PaymentEvent {

    public PaymentCancelledEvent(Payment payment, ZonedDateTime createdAt, List<String> failureMessages) {
        super(payment, createdAt, failureMessages);
    }
}
