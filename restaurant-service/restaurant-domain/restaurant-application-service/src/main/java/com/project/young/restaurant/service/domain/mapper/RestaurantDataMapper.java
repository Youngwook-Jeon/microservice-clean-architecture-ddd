package com.project.young.restaurant.service.domain.mapper;

import org.springframework.stereotype.Component;

@Component
public class RestaurantDataMapper {

//    public Restaurant restaurantApprovalRequestToRestaurant(RestaurantApprovalRequest
//                                                                    restaurantApprovalRequest) {
//        return Restaurant.builder()
//                .restaurantId(new RestaurantId(UUID.fromString(restaurantApprovalRequest.getRestaurantId())))
//                .orderDetail(OrderDetail.builder()
//                        .orderId(new OrderId(UUID.fromString(restaurantApprovalRequest.getOrderId())))
//                        .products(restaurantApprovalRequest.getProducts().stream().map(
//                                        product -> Product.builder()
//                                                .productId(product.getId())
//                                                .quantity(product.getQuantity())
//                                                .build())
//                                .collect(Collectors.toList()))
//                        .totalAmount(new Money(restaurantApprovalRequest.getPrice()))
//                        .orderStatus(OrderStatus.valueOf(restaurantApprovalRequest.getRestaurantOrderStatus().name()))
//                        .build())
//                .build();
//    }
//
//    public OrderEventPayload
//    orderApprovalEventToOrderEventPayload(OrderApprovalEvent orderApprovalEvent) {
//        return OrderEventPayload.builder()
//                .orderId(orderApprovalEvent.getOrderApproval().getOrderId().getValue().toString())
//                .restaurantId(orderApprovalEvent.getRestaurantId().getValue().toString())
//                .orderApprovalStatus(orderApprovalEvent.getOrderApproval().getApprovalStatus().name())
//                .createdAt(orderApprovalEvent.getCreatedAt())
//                .failureMessages(orderApprovalEvent.getFailureMessages())
//                .build();
//    }
}
