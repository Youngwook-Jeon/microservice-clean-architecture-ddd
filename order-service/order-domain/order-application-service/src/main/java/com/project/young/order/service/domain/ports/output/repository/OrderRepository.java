package com.project.young.order.service.domain.ports.output.repository;

import com.project.young.domain.valueobject.OrderId;
import com.project.young.order.service.domain.entity.Order;
import com.project.young.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    Optional<Order> findById(OrderId orderId);

    Order save(Order order);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
