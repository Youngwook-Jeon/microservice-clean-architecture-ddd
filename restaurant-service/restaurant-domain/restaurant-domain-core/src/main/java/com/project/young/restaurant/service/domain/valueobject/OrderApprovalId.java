package com.project.young.restaurant.service.domain.valueobject;

import com.project.young.domain.valueobject.BaseId;

import java.util.UUID;

public class OrderApprovalId extends BaseId<UUID> {

    public OrderApprovalId(UUID value) {
        super(value);
    }
}
