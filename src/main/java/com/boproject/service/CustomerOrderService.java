package com.boproject.service;

import com.boproject.model.CustomerOrder;

import java.util.List;

/**
 * Created by Bartek
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);

    List<CustomerOrder> getAllOrders();
}
