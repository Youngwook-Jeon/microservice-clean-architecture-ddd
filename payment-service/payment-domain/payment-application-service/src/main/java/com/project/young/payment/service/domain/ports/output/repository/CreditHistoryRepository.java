package com.project.young.payment.service.domain.ports.output.repository;

import com.project.young.domain.valueobject.CustomerId;
import com.project.young.payment.service.domain.entity.CreditHistory;

import java.util.List;
import java.util.Optional;

public interface CreditHistoryRepository {

    CreditHistory save(CreditHistory creditHistory);

    Optional<List<CreditHistory>> findByCustomerId(CustomerId customerId);
}
