package com.project.young.order.service.domain.ports.output.message.publisher.payment;

import com.project.young.order.service.domain.outbox.model.payment.OrderPaymentOutboxMessage;
import com.project.young.outbox.OutboxStatus;

import java.util.function.BiConsumer;

public interface PaymentRequestMessagePublisher {

    void publish(OrderPaymentOutboxMessage orderPaymentOutboxMessage,
                 BiConsumer<OrderPaymentOutboxMessage, OutboxStatus> outboxCallback);
}
