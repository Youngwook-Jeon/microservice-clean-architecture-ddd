package com.project.young.restaurant.service.domain;

import com.project.young.restaurant.service.domain.dto.RestaurantApprovalRequest;
import com.project.young.restaurant.service.domain.event.OrderApprovalEvent;
import com.project.young.restaurant.service.domain.ports.input.message.listener.RestaurantApprovalRequestMessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RestaurantApprovalRequestMessageListenerImpl implements RestaurantApprovalRequestMessageListener {

    private final RestaurantApprovalRequestHelper restaurantApprovalRequestHelper;

    public RestaurantApprovalRequestMessageListenerImpl(
            RestaurantApprovalRequestHelper restaurantApprovalRequestHelper
    ) {
        this.restaurantApprovalRequestHelper = restaurantApprovalRequestHelper;
    }

    @Override
    public void approveOrder(RestaurantApprovalRequest restaurantApprovalRequest) {
        OrderApprovalEvent orderApprovalEvent = restaurantApprovalRequestHelper
                .persistOrderApproval(restaurantApprovalRequest);
        orderApprovalEvent.fire();
    }
}
