package com.boproject.dao;

import com.boproject.model.Cart;

import java.io.IOException;

/**
 * Created by Bartek
 */
public interface CartDao {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);

}
