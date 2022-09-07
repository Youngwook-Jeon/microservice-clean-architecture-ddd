package com.project.young.order.service.dataaccess.outbox.payment.repository;

import com.project.young.order.service.dataaccess.outbox.payment.entity.PaymentOutboxEntity;
import com.project.young.outbox.OutboxStatus;
import com.project.young.saga.SagaStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PaymentOutboxJpaRepository extends JpaRepository<PaymentOutboxEntity, UUID> {

    Optional<List<PaymentOutboxEntity>> findByTypeAndOutboxStatusAndSagaStatusIn(String type,
                                                                                 OutboxStatus outboxStatus,
                                                                                 List<SagaStatus> sagaStatus);

    Optional<PaymentOutboxEntity> findByTypeAndSagaIdAndSagaStatusIn(String type,
                                                                     UUID sagaId,
                                                                     List<SagaStatus> sagaStatus);

    void deleteByTypeAndOutboxStatusAndSagaStatusIn(String type,
                                                    OutboxStatus outboxStatus,
                                                    List<SagaStatus> sagaStatus);

}
