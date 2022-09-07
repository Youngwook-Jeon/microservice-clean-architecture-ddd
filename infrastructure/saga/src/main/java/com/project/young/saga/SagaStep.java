package com.project.young.saga;

import com.project.young.domain.event.DomainEvent;

public interface SagaStep<T> {
    void process(T data);
    void rollback(T data);
}
