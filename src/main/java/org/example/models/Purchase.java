package org.example.models;

import java.util.ArrayList;

public class Purchase {
    ArrayList<Ticket> tickets;
    int total;

    public Purchase() {
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
}
