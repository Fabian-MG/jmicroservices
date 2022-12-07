package com.fabian.customer.request;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomerRegistrationRequest {

    String firstName;
    String lastName;
    String email;

    public CustomerRegistrationRequest() {}

    public CustomerRegistrationRequest(String firstName, String lastName, String email) {
        log.info("Constructing request object");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CustomerRegistrationRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
