package com.boproject.service.impl;

import com.boproject.dao.CustomerOrderDao;
import com.boproject.model.Cart;
import com.boproject.model.CartItem;
import com.boproject.model.CustomerOrder;
import com.boproject.service.CartService;
import com.boproject.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bartek
 */

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal=0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            grandTotal+=item.getTotalPrice();
        }

        return grandTotal;
    }

    public List<CustomerOrder> getAllOrders() {
        return customerOrderDao.getAllOrders();
    }
}
