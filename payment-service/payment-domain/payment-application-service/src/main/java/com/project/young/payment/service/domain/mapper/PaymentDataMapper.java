package com.project.young.payment.service.domain.mapper;

import com.project.young.domain.valueobject.CustomerId;
import com.project.young.domain.valueobject.Money;
import com.project.young.domain.valueobject.OrderId;
import com.project.young.payment.service.domain.dto.PaymentRequest;
import com.project.young.payment.service.domain.entity.Payment;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PaymentDataMapper {

    public Payment paymentRequestModelToPayment(PaymentRequest paymentRequest) {
        return Payment.builder()
                .orderId(new OrderId(UUID.fromString(paymentRequest.getOrderId())))
                .customerId(new CustomerId(UUID.fromString(paymentRequest.getCustomerId())))
                .price(new Money(paymentRequest.getPrice()))
                .build();
    }
}
