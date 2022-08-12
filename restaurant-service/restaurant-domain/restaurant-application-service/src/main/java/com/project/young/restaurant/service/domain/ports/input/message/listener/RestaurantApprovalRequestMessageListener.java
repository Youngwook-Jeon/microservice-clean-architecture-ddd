package com.project.young.restaurant.service.domain.ports.input.message.listener;

import com.project.young.restaurant.service.domain.dto.RestaurantApprovalRequest;

public interface RestaurantApprovalRequestMessageListener {

    void approveOrder(RestaurantApprovalRequest restaurantApprovalRequest);
}
