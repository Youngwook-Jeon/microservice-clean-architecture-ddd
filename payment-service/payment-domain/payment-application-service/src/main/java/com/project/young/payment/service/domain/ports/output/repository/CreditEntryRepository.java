package com.project.young.payment.service.domain.ports.output.repository;

import com.project.young.domain.valueobject.CustomerId;
import com.project.young.payment.service.domain.entity.CreditEntry;

import java.util.Optional;

public interface CreditEntryRepository {

    CreditEntry save(CreditEntry creditEntry);

    Optional<CreditEntry> findByCustomerId(CustomerId customerId);
}
