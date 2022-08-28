package com.project.young.order.service.domain.ports.output.message.publisher.restaurantapproval;

import com.project.young.order.service.domain.outbox.model.approval.OrderApprovalOutboxMessage;
import com.project.young.outbox.OutboxStatus;

import java.util.function.BiConsumer;

public interface RestaurantApprovalRequestMessagePublisher {

    void publish(OrderApprovalOutboxMessage orderApprovalOutboxMessage,
                 BiConsumer<OrderApprovalOutboxMessage, OutboxStatus> outboxCallback);
}
