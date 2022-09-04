package com.project.young.order.service.domain;

import com.project.young.order.service.domain.dto.create.CreateOrderCommand;
import com.project.young.order.service.domain.dto.create.CreateOrderResponse;
import com.project.young.order.service.domain.event.OrderCreatedEvent;
import com.project.young.order.service.domain.mapper.OrderDataMapper;
import com.project.young.order.service.domain.outbox.scheduler.payment.PaymentOutboxHelper;
import com.project.young.outbox.OutboxStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Slf4j
@Component
public class OrderCreateCommandHandler {

    private static final String ORDER_CREATED = "Order is created";

    private final OrderCreatedHelper orderCreatedHelper;
    private final OrderDataMapper orderDataMapper;
    private final PaymentOutboxHelper paymentOutboxHelper;
    private final OrderSagaHelper orderSagaHelper;

    public OrderCreateCommandHandler(
            OrderCreatedHelper orderCreatedHelper,
            OrderDataMapper orderDataMapper,
            PaymentOutboxHelper paymentOutboxHelper,
            OrderSagaHelper orderSagaHelper) {
        this.orderCreatedHelper = orderCreatedHelper;
        this.orderDataMapper = orderDataMapper;
        this.paymentOutboxHelper = paymentOutboxHelper;
        this.orderSagaHelper = orderSagaHelper;
    }

    @Transactional
    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand) {
        OrderCreatedEvent orderCreatedEvent = orderCreatedHelper.persistOrder(createOrderCommand);
        log.info("Order is created with id: {}", orderCreatedEvent.getOrder().getId().getValue());
        CreateOrderResponse createOrderResponse = orderDataMapper
                .orderToCreateOrderResponse(orderCreatedEvent.getOrder(), ORDER_CREATED);
        paymentOutboxHelper.savePaymentOutboxMessage(
                orderDataMapper.orderCreatedEventToOrderPaymentEventPayload(orderCreatedEvent),
                orderCreatedEvent.getOrder().getOrderStatus(),
                orderSagaHelper.orderStatusToSagaStatus(orderCreatedEvent.getOrder().getOrderStatus()),
                OutboxStatus.STARTED,
                UUID.randomUUID()
        );

        log.info("Returning CreateOrderResponse with order id: {}", orderCreatedEvent.getOrder().getId());
        return createOrderResponse;
    }

}
