package com.project.young.restaurant.service.domain;

import com.project.young.domain.event.publisher.DomainEventPublisher;
import com.project.young.restaurant.service.domain.entity.Restaurant;
import com.project.young.restaurant.service.domain.event.OrderApprovalEvent;
import com.project.young.restaurant.service.domain.event.OrderApprovedEvent;
import com.project.young.restaurant.service.domain.event.OrderRejectedEvent;

import java.util.List;

public interface RestaurantDomainService {

    OrderApprovalEvent validateOrder(
            Restaurant restaurant,
            List<String> failureMessages,
            DomainEventPublisher<OrderApprovedEvent> orderApprovedEventDomainEventPublisher,
            DomainEventPublisher<OrderRejectedEvent> orderRejectedEventDomainEventPublisher
    );
}
