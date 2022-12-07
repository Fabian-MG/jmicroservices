package com.fabian.clients.fraud;

public class FraudResponse {

    private boolean isFraudster;

    public boolean isFraudster() {
        return isFraudster;
    }

    public FraudResponse() {};

    public FraudResponse(boolean isFraudster) {
        this.isFraudster = isFraudster;
    }

    @Override
    public String toString() {
        return "FraudResponse{" +
                "isFraudster=" + isFraudster +
                '}';
    }
}
