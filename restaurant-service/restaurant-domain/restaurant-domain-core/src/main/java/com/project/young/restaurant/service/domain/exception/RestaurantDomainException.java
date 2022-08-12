package com.project.young.restaurant.service.domain.exception;

import com.project.young.domain.exception.DomainException;

public class RestaurantDomainException extends DomainException {

    public RestaurantDomainException(String message) {
        super(message);
    }

    public RestaurantDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
