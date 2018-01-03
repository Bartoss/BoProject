package com.boproject.dao;

import com.boproject.model.Customer;

import java.util.List;

/**
 * Created by Bartek
 */
public interface CustomerDao {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);

}
