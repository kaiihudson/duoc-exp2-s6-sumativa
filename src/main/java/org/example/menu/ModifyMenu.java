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

public class ModifyMenu {
    public static void execute(Scanner sc, Theatre theatre, Cart cart){
        boolean done = false;
        Ticket newTicket = new Ticket();
        Ticket oldTicket;
        do {
            // ask for the ticket to modify
            System.out.println("Ingrese Boleto a modificar");
            System.out.println(cart);
            System.out.println("Escriba 'SALIR' para salir");
            System.out.print("Asiento: ");
            String rawIndex = sc.nextLine().toLowerCase();
            if (rawIndex.equals("salir")){
                done = true;
                continue;
            }
            int index;
            try {
                index = Integer.parseInt(rawIndex);
            } catch (NumberFormatException e){
                System.err.println("Boleto no Valido");
                continue;
            }
            if (index-1 > cart.getTickets().size() || index-1 < 0) {
                System.err.println("El Boleto" + index + " no es valido");
                continue;
            }
            // save old ticket for later validation
            oldTicket = cart.getTickets().get(index-1);
            // ask for new ticket to replace
            boolean subQ = false;
            while (!subQ){
                // Ask for coordinate
                System.out.println("Ingrese su nuevo asiento");
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
                    newTicket.setRow(row);
                    newTicket.setColumn(column);
                    TicketService.setPrice(row, newTicket);
                    subQ = true;
                } else {
                    System.err.println("Asiento no disponible");
                }
            }
            // ask for confirmation
            System.out.println("Esta seguro de cambiar los asientos?");
            System.out.println("OUT: "+ oldTicket);
            System.out.println(" IN: " + newTicket);
            System.out.println("Diferencia: $" + (oldTicket.getPrice()-newTicket.getPrice()));
            System.out.print("Respuesta [y/n]: ");
            String respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("y") || respuesta.equals("s")){
                // delete old ticket
                // update total
                unreserveTicket(theatre, cart, oldTicket, index-1);
                // add new ticket
                // update total again
                reserveTicket(theatre, cart, newTicket, index-1);
                // end
            }
        } while (!done);
    }
    private static void unreserveTicket(Theatre theatre, Cart cart, Ticket ticket, int index){
        TheatreService.unreserveSeat(ticket.getRow(), ticket.getColumn(), theatre);
        CartService.removeTicket(cart, index);
        CartService.calculateTotalOnRemoveTicket(cart, ticket);
    }
    private static void reserveTicket(Theatre theatre, Cart cart, Ticket ticket, int index){
        TheatreService.reserveSeat(ticket.getRow(), ticket.getColumn(), theatre);
        CartService.addTicket(cart, ticket, index);
        CartService.calculateTotalOnNewTicket(cart, ticket);
    }
}
