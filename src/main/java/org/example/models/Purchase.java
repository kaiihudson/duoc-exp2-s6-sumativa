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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();
        for (int i = 0; i < tickets.size(); i++){
            Ticket ticket = tickets.get(i);
            data.append(i + 1).append(": ").append(ticket.getColumn().toString().replace("COLUMN", "Columna").replace("_", " "));
            data.append(" Asiento ").append(ticket.getRow()).append(" ");
            data.append("Precio: $").append(ticket.getPrice()).append("\n");
        }
        return "\n"+ data;
    }
}
