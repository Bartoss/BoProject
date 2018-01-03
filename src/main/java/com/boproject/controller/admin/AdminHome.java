package com.boproject.controller.admin;

import com.boproject.model.CartItem;
import com.boproject.model.Customer;
import com.boproject.model.Product;
import com.boproject.service.CartItemService;
import com.boproject.service.CustomerService;
import com.boproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Bartek
 */

@Controller
@RequestMapping("/admin")
public class AdminHome {

    @Autowired
    private ProductService productService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CartItemService cartItemService;

    @RequestMapping
    public String adminPage() {
        return "admin";
    }

    @RequestMapping("/productInventory")
    public String productInventory(Model model) {
        List<Product> products = productService.getProductList();
        model.addAttribute("products", products);

        return "productInventory";
    }

    @RequestMapping("/customer")
    public String customerManagement(Model model) {

        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("customerList", customerList);

        return "customerManagement";
    }

    @RequestMapping("/history")
    public String customerHistory(Model model){
        List<CartItem> historyList = cartItemService.getAllOrders();
        model.addAttribute("historyList", historyList);
        assert 0 == 77 :"Errorrr";
        return "customerHistory";
    }

}
