package com.fabian.customer.response;

public class FraudResponse {

    private boolean isFraudster;

    public boolean isFraudster() {
        return isFraudster;
    }

    public FraudResponse(boolean isFraudster) {
        this.isFraudster = isFraudster;
    }

}
