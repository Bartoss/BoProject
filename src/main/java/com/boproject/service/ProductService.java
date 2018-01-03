package com.boproject.service;

import com.boproject.model.Product;

import java.util.List;

/**
 * Created by Bartek
 */
public interface ProductService {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
