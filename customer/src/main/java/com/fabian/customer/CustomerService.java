package com.fabian.customer;

import com.fabian.amqp.RabbitMQProducer;
import com.fabian.clients.fraud.FraudClient;
import com.fabian.clients.fraud.FraudResponse;
import com.fabian.clients.notification.NotificationRequest;
import com.fabian.customer.request.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final FraudClient fraudClient;
    private final CustomerRepository customerRepository;
    private final RabbitMQProducer rabbitMQProducer;

    public CustomerService(FraudClient fraudClient, CustomerRepository customerRepository, RabbitMQProducer rabbitMQProducer) {
        this.fraudClient = fraudClient;
        this.customerRepository = customerRepository;
        this.rabbitMQProducer = rabbitMQProducer;
    }

    public void registerCustomer(CustomerRegistrationRequest request) {
        try {
            Customer customer = new CustomerBuilder()
                    .setEmail(request.getEmail())
                    .setFirstName(request.getFirstName())
                    .setLastName(request.getLastName())
                    .build();

            customerRepository.saveAndFlush(customer);

            FraudResponse fraudResponse = fraudClient.isFraudster(customer.getId());

            if(fraudResponse != null && fraudResponse.isFraudster()) {
                 throw new IllegalStateException("fraudster");
             }

            String message = String.format("Hi %s welcome to the business", customer.getFirstName());

            NotificationRequest notificationRequest = new NotificationRequest(
                    customer.getId(),
                    customer.getEmail(),
                    message
            );

            rabbitMQProducer.publish(
                    notificationRequest,
                    "internal.exchange",
                    "internal.notification.routing-key"
            );

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
