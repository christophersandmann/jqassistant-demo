package org.jqassistant.demo.shoppingcart.api.model;

import org.jqassistant.demo.usermanagement.api.model.Customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cart {

    @Id
    private long id;

    @OneToOne
    private Customer customer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
