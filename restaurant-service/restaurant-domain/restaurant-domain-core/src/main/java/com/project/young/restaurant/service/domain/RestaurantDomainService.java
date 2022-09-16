package com.project.young.restaurant.service.domain;

import com.project.young.restaurant.service.domain.entity.Restaurant;
import com.project.young.restaurant.service.domain.event.OrderApprovalEvent;

import java.util.List;

public interface RestaurantDomainService {

    OrderApprovalEvent validateOrder(Restaurant restaurant, List<String> failureMessages);
}
