package org.jqassistant.demo.usermanagement.api.model;

import javax.persistence.Entity;

@Entity
public class Customer extends Person {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
