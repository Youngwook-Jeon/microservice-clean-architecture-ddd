package com.project.young.restaurant.service.messaging.publisher.kafka;

import com.project.young.kafka.order.avro.model.RestaurantApprovalResponseAvroModel;
import com.project.young.kafka.producer.KafkaMessageHelper;
import com.project.young.kafka.producer.service.KafkaProducer;
import com.project.young.restaurant.service.domain.config.RestaurantServiceConfigData;
import com.project.young.restaurant.service.messaging.mapper.RestaurantMessagingDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
//public class RestaurantApprovalEventKafkaPublisher implements RestaurantApprovalResponseMessagePublisher {
public class RestaurantApprovalEventKafkaPublisher {
    private final RestaurantMessagingDataMapper restaurantMessagingDataMapper;
    private final KafkaProducer<String, RestaurantApprovalResponseAvroModel> kafkaProducer;
    private final RestaurantServiceConfigData restaurantServiceConfigData;
    private final KafkaMessageHelper kafkaMessageHelper;

    public RestaurantApprovalEventKafkaPublisher(RestaurantMessagingDataMapper dataMapper,
                                                 KafkaProducer<String, RestaurantApprovalResponseAvroModel>
                                                         kafkaProducer,
                                                 RestaurantServiceConfigData restaurantServiceConfigData,
                                                 KafkaMessageHelper kafkaMessageHelper) {
        this.restaurantMessagingDataMapper = dataMapper;
        this.kafkaProducer = kafkaProducer;
        this.restaurantServiceConfigData = restaurantServiceConfigData;
        this.kafkaMessageHelper = kafkaMessageHelper;
    }

//    @Override
//    public void publish(OrderOutboxMessage orderOutboxMessage,
//                        BiConsumer<OrderOutboxMessage, OutboxStatus> outboxCallback) {
//        OrderEventPayload orderEventPayload =
//                kafkaMessageHelper.getOrderEventPayload(orderOutboxMessage.getPayload(),
//                        OrderEventPayload.class);
//
//        String sagaId = orderOutboxMessage.getSagaId().toString();
//
//        log.info("Received OrderOutboxMessage for order id: {} and saga id: {}",
//                orderEventPayload.getOrderId(),
//                sagaId);
//        try {
//            RestaurantApprovalResponseAvroModel restaurantApprovalResponseAvroModel =
//                    restaurantMessagingDataMapper
//                            .orderEventPayloadToRestaurantApprovalResponseAvroModel(sagaId, orderEventPayload);
//
//            kafkaProducer.send(restaurantServiceConfigData.getRestaurantApprovalResponseTopicName(),
//                    sagaId,
//                    restaurantApprovalResponseAvroModel,
//                    kafkaMessageHelper.getKafkaCallback(restaurantServiceConfigData
//                                    .getRestaurantApprovalResponseTopicName(),
//                            restaurantApprovalResponseAvroModel,
//                            orderOutboxMessage,
//                            outboxCallback,
//                            orderEventPayload.getOrderId(),
//                            "RestaurantApprovalResponseAvroModel"));
//
//            log.info("RestaurantApprovalResponseAvroModel sent to kafka for order id: {} and saga id: {}",
//                    restaurantApprovalResponseAvroModel.getOrderId(), sagaId);
//        } catch (Exception e) {
//            log.error("Error while sending RestaurantApprovalResponseAvroModel message" +
//                            " to kafka with order id: {} and saga id: {}, error: {}",
//                    orderEventPayload.getOrderId(), sagaId, e.getMessage());
//        }
//    }

}
