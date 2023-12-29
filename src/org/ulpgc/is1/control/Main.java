package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.util.Date;

public class Main {

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

    }
    public static void main(String[] args) {
        PaddleManager paddleManager = new PaddleManager();
        init(paddleManager);

        System.out.println("NIF del primer cliente: ");
        System.out.println(paddleManager.getCustomer(0).getNif());
        System.out.println("NIF del segundo cliente: ");
        System.out.println(paddleManager.getCustomer(1).getNif());

        System.out.println("Datos del primer cliente: ");
        System.out.println("Nombre: " + paddleManager.getCustomer(0).getName() + " " +
                paddleManager.getCustomer(0).getSurname());
        System.out.println("NIF: " + paddleManager.getCustomer(0).getNif());
        System.out.println("Datos del segundo cliente: ");
        System.out.println("Nombre: " + paddleManager.getCustomer(1).getName() + " " +
                paddleManager.getCustomer(1).getSurname());
        System.out.println("NIF: " + paddleManager.getCustomer(1).getNif());

        paddleManager.reserve(new Date(),
                paddleManager.getCustomer(0),
                paddleManager.getCourt(1),
                paddleManager.getCourt(1).getPrice());

        paddleManager.deleteCustomer(1);

        System.out.println("Hay " + paddleManager.getCustomerSize() + " cliente(s)");

        for(Customer c: paddleManager.getCustomers()){
            System.out.println("Datos del cliente: ");
            System.out.println("Nombre: " + c.getName());
            System.out.println("Apellido: " + c.getSurname());
            System.out.println("NIF: " + c.getNif());
            for (Reservation r: c.getReservations()){
                System.out.println("Datos de su reserva: ");
                System.out.println("Precio: " + r.getPrice());
                System.out.println("Nombre de la pista: " + r.getCourt().getName());
                System.out.println("Tipo de pista: " + r.getCourt().getType());
                System.out.println("Fecha: " + r.getDate());
            }
        }
    }
}



