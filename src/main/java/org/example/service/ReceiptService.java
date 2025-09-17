package org.example.service;

import org.example.models.Purchase;

public class ReceiptService {
    public static void print(Purchase purchase){
        System.out.println("Aca va la boleta");
        // ubicacion de los asientos
        System.out.println(purchase);
        // cantidad de entradas
        System.out.println(purchase.getTickets().size());
        // costo total
        System.out.println("Costo total: "+ purchase.getTotal());
    }
}
