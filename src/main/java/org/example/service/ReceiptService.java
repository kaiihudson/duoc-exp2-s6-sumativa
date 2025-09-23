package org.example.service;

import org.example.models.Purchase;

public class ReceiptService {
    public static void print(Purchase purchase){
        if(purchase.getTickets() == null){
            System.out.println("No se ha COMPRADO ningún boleto");
        } else {
            System.out.println("BOLETA DE SERVICIOS");
            System.out.println("Resumen de asientos comprados: " );
            // ubicacion de los asientos
            System.out.println(purchase);
            // cantidad de entradas
            System.out.println("Cantidad de boletos: " +
                    purchase.getTickets().size());
            // costo total
            System.out.println("Total Boleta: $"+ purchase.getTotal());
        }
    }
}
