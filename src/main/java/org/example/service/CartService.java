package org.example.service;

import org.example.models.Cart;
import org.example.models.Ticket;

import java.util.ArrayList;

public class CartService {
    public static void addTicket(Cart cart, Ticket ticket){
        ArrayList<Ticket> cartArray = cart.getTickets();
        cartArray.add(ticket);
        cart.setTickets(cartArray);
    }
    public static void addTicket(Cart cart, Ticket ticket, int index){
        ArrayList<Ticket> cartArray = cart.getTickets();
        cartArray.add(index, ticket);
        cart.setTickets(cartArray);
    }
    public static void removeTicket(Cart cart, int index){
        ArrayList<Ticket> cartArray = cart.getTickets();
        cartArray.remove(index);
        cart.setTickets(cartArray);
    }
    public static void calculateTotalOnNewTicket(Cart cart, Ticket ticket){
        cart.setTotal(cart.getTotal() + ticket.getPrice());
    }

    public static void calculateTotalOnRemoveTicket(Cart cart, Ticket ticket){
        cart.setTotal(cart.getTotal() - ticket.getPrice());
    }
}
