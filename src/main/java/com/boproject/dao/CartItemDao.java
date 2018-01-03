package com.boproject.dao;

import com.boproject.model.Cart;
import com.boproject.model.CartItem;

import java.util.List;

/**
 * Created by Bartek
 */
public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);

    List<CartItem> getAllCards();
}
