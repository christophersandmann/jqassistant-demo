package org.jqassistant.demo.usermanagement.api;

import org.jqassistant.demo.usermanagement.api.model.Customer;

public interface CustomerService {

    Customer findByNumber(int number);

}
