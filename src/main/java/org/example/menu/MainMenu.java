package org.example.menu;

import org.example.models.Cart;
import org.example.models.Purchase;
import org.example.models.Theatre;
import org.example.service.PurchaseService;
import org.example.service.ReceiptService;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    public static void execute() {
        Cart cart = new Cart();
        Theatre theatre = new Theatre();
        Purchase purchase = new Purchase();
        Scanner sc = new Scanner(System.in);

        ArrayList<String> options = new ArrayList<>();
        options.add("1. Reservar un nuevo asiento");
        options.add("2. Modificar un asiento reservado");
        options.add("3. Compra tus boletos");
        options.add("4. Imprimir boleta");
        options.add("5. Salir");

        // Show options
        System.out.println("Bienvenido a Teatro Moro");
        boolean done = false;
        do {
            if (!cart.getTickets().isEmpty()) {
                System.out.println(cart);
            }
            System.out.println("¿Qué desea hacer?");
            for(String option: options){
                System.out.println(option);
            }
            System.out.print("Opción: ");
            String rawOption = sc.nextLine();
            int option;
            try {
                option = Integer.parseInt(rawOption);
            } catch (NumberFormatException e) {
                System.err.println("Opción no valida");
                continue;
            }
            if (option >= 6 || option <= 0) {
                System.err.println("Opción no valida");
                continue;
            }
            switch (option){
                // Reserve seating
                case 1:
                    ReserveMenu.execute(sc, theatre, cart);
                    break;
                // Modify reservation
                case 2:
                    ModifyMenu.execute(sc, theatre, cart);
                    break;
                // Buy Tickets
                case 3:
                    PurchaseService.purchaseTickets(cart, purchase);
                    // reset cart for new purchase
                    cart = new Cart();
                    break;
                // Show Receipt
                case 4:
                    ReceiptService.print(purchase);
                    break;
                case 5:
                    System.out.println("Gracias por comprar en Teatro Moro");
                    done = true;

            }
        } while (!done);
        sc.close();
    }
}
