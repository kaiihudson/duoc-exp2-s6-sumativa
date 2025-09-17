package org.example.service;

import org.example.models.Cart;
import org.example.models.Purchase;

public class PurchaseService {
    public static void purchaseTickets(Cart cart, Purchase purchase){
        purchase.setTickets(cart.getTickets());
        purchase.setTotal(cart.getTotal());
    }
}
