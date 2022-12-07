package com.fabian.customer;

public class CustomerBuilder {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public CustomerBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Customer build() {
        return new Customer(id, firstName, lastName, email);
    }
}
