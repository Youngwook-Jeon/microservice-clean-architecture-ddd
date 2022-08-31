package com.project.young.outbox;

public interface OutboxScheduler {
    void processOutboxMessage();
}
