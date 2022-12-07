package com.fabian.fraud;

import java.time.LocalDateTime;

public class FraudBuilder {

    private int id;
    private int customerId;
    private boolean isFraudster;
    private LocalDateTime createdAt;

    public FraudBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public FraudBuilder setCustomerId(int customerId) {
        this.customerId = customerId;
        return this;
    }

    public FraudBuilder setFraudster(boolean fraudster) {
        isFraudster = fraudster;
        return this;
    }

    public FraudBuilder setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FraudCheckHistory build() {
        return new FraudCheckHistory(id, customerId, isFraudster, createdAt);
    }
}
