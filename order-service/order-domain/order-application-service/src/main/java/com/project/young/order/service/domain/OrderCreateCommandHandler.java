package com.project.young.order.service.domain;

import com.project.young.order.service.domain.dto.create.CreateOrderCommand;
import com.project.young.order.service.domain.dto.create.CreateOrderResponse;
import com.project.young.order.service.domain.event.OrderCreatedEvent;
import com.project.young.order.service.domain.mapper.OrderDataMapper;
import com.project.young.order.service.domain.ports.output.message.publisher.payment.OrderCreatedPaymentRequestMessagePublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderCreateCommandHandler {

    private static final String ORDER_CREATED = "Order is created";

    private final OrderCreatedHelper orderCreatedHelper;
    private final OrderDataMapper orderDataMapper;
    private final OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher;

    public OrderCreateCommandHandler(OrderCreatedHelper orderCreatedHelper,
                                     OrderDataMapper orderDataMapper,
                                     OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher) {
        this.orderCreatedHelper = orderCreatedHelper;
        this.orderDataMapper = orderDataMapper;
        this.orderCreatedPaymentRequestMessagePublisher = orderCreatedPaymentRequestMessagePublisher;
    }

    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand) {
        OrderCreatedEvent orderCreatedEvent = orderCreatedHelper.persistOrder(createOrderCommand);
        log.info("Order is created with id: {}", orderCreatedEvent.getOrder().getId().getValue());
        orderCreatedPaymentRequestMessagePublisher.publish(orderCreatedEvent);

        return orderDataMapper.orderToCreateOrderResponse(orderCreatedEvent.getOrder(), ORDER_CREATED);
    }

}
