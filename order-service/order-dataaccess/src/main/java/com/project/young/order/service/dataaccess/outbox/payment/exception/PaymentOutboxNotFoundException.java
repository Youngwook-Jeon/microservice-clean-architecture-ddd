package com.project.young.order.service.dataaccess.outbox.payment.exception;

public class PaymentOutboxNotFoundException extends RuntimeException {

    public PaymentOutboxNotFoundException(String message) {
        super(message);
    }
}