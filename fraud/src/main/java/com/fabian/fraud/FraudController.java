package com.fabian.fraud;

import com.fabian.clients.fraud.FraudResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/fraud")
public class FraudController {

    private final FraudService fraudService;

    public FraudController(FraudService fraudService) {
        this.fraudService = fraudService;
    }

    @GetMapping(path = "{customerId}")
    public FraudResponse isFraudster(@PathVariable("customerId")int customerId) {
        boolean fraudulentCustomer = fraudService.isFraudulentCustomer(customerId);

        return new FraudResponse(fraudulentCustomer);
    }
}
