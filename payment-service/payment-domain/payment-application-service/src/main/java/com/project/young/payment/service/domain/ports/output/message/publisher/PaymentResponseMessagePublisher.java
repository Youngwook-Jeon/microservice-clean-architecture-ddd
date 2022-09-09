package com.project.young.payment.service.domain.ports.output.message.publisher;

import com.project.young.outbox.OutboxStatus;
import com.project.young.payment.service.domain.outbox.model.OrderOutboxMessage;

import java.util.function.BiConsumer;

public interface PaymentResponseMessagePublisher {
    void publish(OrderOutboxMessage orderOutboxMessage,
                 BiConsumer<OrderOutboxMessage, OutboxStatus> outboxCallback);
}
