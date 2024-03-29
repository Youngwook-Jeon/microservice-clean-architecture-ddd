package com.project.young.payment.service.domain;

import com.project.young.domain.event.publisher.DomainEventPublisher;
import com.project.young.payment.service.domain.entity.CreditEntry;
import com.project.young.payment.service.domain.entity.CreditHistory;
import com.project.young.payment.service.domain.entity.Payment;
import com.project.young.payment.service.domain.event.PaymentCancelledEvent;
import com.project.young.payment.service.domain.event.PaymentCompletedEvent;
import com.project.young.payment.service.domain.event.PaymentEvent;
import com.project.young.payment.service.domain.event.PaymentFailedEvent;

import java.util.List;

public interface PaymentDomainService {

    PaymentEvent validateAndInitiatePayment(Payment payment,
                                            CreditEntry creditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessages);

    PaymentEvent validateAndCancelPayment(Payment payment,
                                          CreditEntry creditEntry,
                                          List<CreditHistory> creditHistories,
                                          List<String> failureMessages);
}
