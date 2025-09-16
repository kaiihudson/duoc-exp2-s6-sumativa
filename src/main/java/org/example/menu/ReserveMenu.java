package org.example.menu;

import org.example.common.utils.Input;
import org.example.models.Cart;
import org.example.models.Column;
import org.example.models.Theatre;
import org.example.models.Ticket;
import org.example.service.CartService;
import org.example.service.TheatreService;
import org.example.service.TicketService;

import java.util.Scanner;

public class ReserveMenu {
    public static void execute(Scanner sc, Theatre theatre, Cart cart) {
        Ticket ticket = new Ticket();
        boolean done = false;
        // Show the theatre
        System.out.println(theatre);
        do {
            // Ask for coordinate
            System.out.println("Ingrese su asiento");
            System.out.println("e.g.: A5, B2, G12");
            System.out.println("Escriba 'SALIR' para salir");
            System.out.print("Coordenada: ");
            String rawCoordinate = sc.nextLine().toLowerCase();
            if (rawCoordinate.equals("salir")){
                done = true;
                continue;
            }

            // Validate Coordinate
            int row;
            Column column;
            if(Input.validateCoordinate(rawCoordinate)){
                column = TheatreService.parseColumn(rawCoordinate.charAt(0));
                row = Integer.parseInt(rawCoordinate.substring(1));
            } else {
                continue;
            }
            // check if seat is available
            boolean notAvailable = TheatreService.checkAvailableSeat(row, column, theatre);
            // if available add to cart
            if (!notAvailable) {
                ticket.setRow(row);
                ticket.setColumn(column);
                TicketService.setPrice(row, ticket);
                reserveTicket(theatre, cart, ticket);
                done = true;
            } else {
                System.err.println("Asiento no disponible");
            }
        } while (!done);
    }

    private static void reserveTicket(Theatre theatre, Cart cart, Ticket ticket) {
        TheatreService.reserveSeat(ticket.getRow(), ticket.getColumn(), theatre);
        CartService.addTicket(cart, ticket);
        CartService.calculateTotalOnNewTicket(cart, ticket);
    }
}
