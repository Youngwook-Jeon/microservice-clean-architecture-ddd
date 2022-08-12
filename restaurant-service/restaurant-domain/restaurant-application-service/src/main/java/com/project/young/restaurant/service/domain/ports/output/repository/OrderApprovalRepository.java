package com.project.young.restaurant.service.domain.ports.output.repository;

import com.project.young.restaurant.service.domain.entity.OrderApproval;

public interface OrderApprovalRepository {

    OrderApproval save(OrderApproval orderApproval);
}
