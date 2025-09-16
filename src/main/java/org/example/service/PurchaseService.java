package org.example.service;

import org.example.models.Purchase;
import org.example.models.Ticket;

import java.util.ArrayList;

public class PurchaseService {
    public static void purchaseTickets(ArrayList<Ticket> tickets, Purchase purchase){
        purchase.setTickets(tickets);
    }
}
