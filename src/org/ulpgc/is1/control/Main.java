package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PaddleManager paddleManager = new PaddleManager();
        init(paddleManager);
    }

    public static void init(PaddleManager paddleManager) {
        Member miembro = new Member(11, "Ana", "Santana", new Nif("11111111T"),
                "Leon y Castillo", 41, 35010, "Las Palmas de Gran Canaria");
        paddleManager.addCustomer(miembro);
        Customer cliente = new Customer("Jorge", "Hernandez", new Nif("12SD34TT4"));
        paddleManager.addCustomer(cliente);

        Court pistaRapida = new Court("Rápida", 20, CourtType.FASTCOURT);
        Court pistaLenta = new Court("Lenta", 20, CourtType.SLOWCOURT);
        paddleManager.addCourt(pistaRapida);
        paddleManager.addCourt(pistaLenta);

        System.out.println("NIF del primer cliente: ");
        System.out.println(miembro.getNif());
        System.out.println("NIF del segundo cliente: ");
        System.out.println(cliente.getNif());

        System.out.println("Datos del primer cliente: ");
        System.out.println(paddleManager.getCustomer(0).getName());
        System.out.println(paddleManager.getCustomer(0).getSurname());
        System.out.println(paddleManager.getCustomer(0).getNif());
        System.out.println("Datos del segundo cliente: ");
        System.out.println(paddleManager.getCustomer(1).getName());
        System.out.println(paddleManager.getCustomer(1).getSurname());
        System.out.println(paddleManager.getCustomer(1).getNif());

        paddleManager.reserve(new Date(), miembro, pistaLenta, pistaLenta.getPrice());

        paddleManager.deleteCustomer(1);

        System.out.println(paddleManager.getCustomerSize());

        for(Reservation reservation: paddleManager.getReservations()){
            System.out.println(reservation.getCustomer());
            System.out.println(reservation.getCourt());
            System.out.println(reservation.getDate());
            System.out.println(reservation.getPrice());
        }
    }

}

