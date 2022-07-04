package com.project.young.payment.service.dataaccess.creditentry.adapter;

import com.project.young.domain.valueobject.CustomerId;
import com.project.young.payment.service.dataaccess.creditentry.mapper.CreditEntryDataAccessMapper;
import com.project.young.payment.service.dataaccess.creditentry.repository.CreditEntryJpaRepository;
import com.project.young.payment.service.domain.entity.CreditEntry;
import com.project.young.payment.service.domain.ports.output.repository.CreditEntryRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CreditEntryRepositoryImpl implements CreditEntryRepository {

    private final CreditEntryJpaRepository creditEntryJpaRepository;
    private final CreditEntryDataAccessMapper creditEntryDataAccessMapper;

    public CreditEntryRepositoryImpl(CreditEntryJpaRepository creditEntryJpaRepository,
                                     CreditEntryDataAccessMapper creditEntryDataAccessMapper) {
        this.creditEntryJpaRepository = creditEntryJpaRepository;
        this.creditEntryDataAccessMapper = creditEntryDataAccessMapper;
    }

    @Override
    public CreditEntry save(CreditEntry creditEntry) {
        return creditEntryDataAccessMapper
                .creditEntryEntityToCreditEntry(
                        creditEntryJpaRepository.save(
                                creditEntryDataAccessMapper.creditEntryToCreditEntryEntity(
                                        creditEntry)));
    }

    @Override
    public Optional<CreditEntry> findByCustomerId(CustomerId customerId) {
        return creditEntryJpaRepository
                .findByCustomerId(customerId.getValue())
                .map(creditEntryDataAccessMapper::creditEntryEntityToCreditEntry);
    }
}
