package com.project.young.domain.event.publisher;

import com.project.young.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
