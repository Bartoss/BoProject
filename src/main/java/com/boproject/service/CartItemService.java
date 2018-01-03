package com.boproject.service;

import com.boproject.model.Cart;
import com.boproject.model.CartItem;

import java.util.List;

/**
 * Created by Bartek
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);

    List<CartItem> getAllOrders();
}
