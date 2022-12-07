package com.fabian.fraud;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FraudService {

    private final FraudRepository fraudRepository;

    public FraudService(FraudRepository fraudRepository) {
        this.fraudRepository = fraudRepository;
    }

    public boolean isFraudulentCustomer(int customerId) {
        fraudRepository.save( new FraudBuilder()
                .setFraudster(false)
                .setCustomerId(customerId)
                .setCreatedAt(LocalDateTime.now())
                .build()
        );

        return false;
    }
}
