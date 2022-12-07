package com.fabian.fraud;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class FraudCheckHistory {

    @Id
    @SequenceGenerator(
            name = "fraud_id_sequence",
            sequenceName = "fraud_id_sequence"
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int customerId;
    private boolean isFraudster;
    private LocalDateTime createdAt;

    public FraudCheckHistory() {}

    public FraudCheckHistory(int id, int customerId, boolean isFraudster, LocalDateTime createdAt) {
        this.id = id;
        this.customerId = customerId;
        this.isFraudster = isFraudster;
        this.createdAt = createdAt;
    }
}
