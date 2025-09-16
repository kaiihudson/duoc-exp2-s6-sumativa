package org.example.service;

import org.example.models.Ticket;

public class TicketService {

    static int row1to3Price = 50000;
    static int row4to6Price = 40000;
    static int row7to9Price = 30000;
    static int row10to12Price = 25000;

    public static void setPrice(int row, Ticket ticket) {
        switch (row){
            case 1,2,3:
                ticket.setPrice(row1to3Price);
                break;
            case 4,5,6:
                ticket.setPrice(row4to6Price);
                break;
            case 7,8,9:
                ticket.setPrice(row7to9Price);
                break;
            case 10,11,12:
                ticket.setPrice(row10to12Price);
                break;
            default:
                System.err.println("Fila no valida");
        }
    }
}
