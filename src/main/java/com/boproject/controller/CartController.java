package com.boproject.controller;

import com.boproject.model.Customer;
import com.boproject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bartek
 */

@Controller
@RequestMapping("/customer/cart")
public class CartController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping
    public String getCart(@AuthenticationPrincipal User activeUser){
        Customer customer = customerService.getCustomerByUsername (activeUser.getUsername());

        //Asercja w przypadku pobrania użytkownika wystąpienie błędu przy połączeniu z bazą danych ponieważ istnieje chociaż jeden użytkownik (admin)
        assert customer == null: "Error in getter Customer, databae not connected.";
        int cartId = customer.getCart().getCartId();


        return "redirect:/customer/cart/"+cartId;
    }

    @RequestMapping("/{cartId}")
    public String getCartRedirect(@PathVariable (value = "cartId") int cartId, Model model) {
        model.addAttribute("cartId", cartId);

        //Asercja w przypadku podania karty o numerze 0 ponieważ powinny dodawać się od 1
        assert cartId == 0: "Wrong number";

        return "cart";
    }

}
