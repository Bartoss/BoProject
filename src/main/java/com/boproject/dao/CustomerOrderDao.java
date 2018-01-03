package com.boproject.dao;

import com.boproject.model.CustomerOrder;

import java.util.List;

/**
 * Created by Bartek
 */
public interface CustomerOrderDao {

    void addCustomerOrder(CustomerOrder customerOrder);

    List<CustomerOrder> getAllOrders();
}
