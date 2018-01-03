package com.boproject.service;

import com.boproject.model.Cart;

/**
 * Created by Bartek
 */
public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
