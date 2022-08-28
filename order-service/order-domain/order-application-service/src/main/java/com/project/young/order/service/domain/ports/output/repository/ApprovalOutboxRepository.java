package com.project.young.order.service.domain.ports.output.repository;

import com.project.young.order.service.domain.outbox.model.approval.OrderApprovalOutboxMessage;
import com.project.young.outbox.OutboxStatus;
import com.project.young.saga.SagaStatus;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ApprovalOutboxRepository {

    OrderApprovalOutboxMessage save(OrderApprovalOutboxMessage orderApprovalOutboxMessage);

    Optional<List<OrderApprovalOutboxMessage>> findByTypeAndOutboxStatusAndSagaStatus(
            String type,
            OutboxStatus outboxStatus,
            SagaStatus... sagaStatus
    );

    Optional<OrderApprovalOutboxMessage> findByTypeAndSagaIdAndSagaStatus(
            String type,
            UUID sagaId,
            SagaStatus... sagaStatus
    );

    void deleteByTypeAndOutboxStatusAndSagaStatus(
            String type,
            OutboxStatus outboxStatus,
            SagaStatus... sagaStatus
    );
}
