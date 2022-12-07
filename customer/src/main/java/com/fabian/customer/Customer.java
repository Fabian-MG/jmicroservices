package com.fabian.customer;

import javax.persistence.*;

@Entity
 public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer_id_sequence",
            sequenceName= "customer_id_sequence"
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String email;
    private String lastName;
    private String firstName;

    public Customer() { }

    public Customer(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
