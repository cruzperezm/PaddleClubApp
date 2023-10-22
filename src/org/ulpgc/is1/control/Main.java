package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static class PaddleManager {
        private ArrayList<Customer> customerList;
        private ArrayList<Court> courtList;
        private ArrayList<Reservation> reservations;

        public PaddleManager() {
            customerList = new ArrayList<>();
            courtList = new ArrayList<>();
            reservations = new ArrayList<>();
        }

        public void addCustomer(String name, String surname, NIF nif) {
            Customer newCustomer = new Customer(name, surname, nif);
            customerList.add(newCustomer);
        }

        public void addCourt(String name, int price, CourtType type) {
            Court newCourt = new Court(name, price, type);
            courtList.add(newCourt);
        }

        public void reserve(ArrayList<Customer> customers, ArrayList<Court> court, int price, Date date) {
            Reservation reservation = new Reservation(date, customers, court, price);
            reservations.add(reservation);
        }
    }

    public static void main(String[] args) {
        PaddleManager paddleManager = new PaddleManager();
        init(paddleManager);
    }

    public static void init(PaddleManager paddleManager) {
        Customer cliente1 = new Customer("Ana", "Santana", new NIF("1111111"));
        Customer cliente2 = new Customer("Jorge", "Hernandez", new NIF("12SD34TT4"));

        Court court1 = new Court("Pista1", 1, CourtType.FASTCOURT);
        Court court2 = new Court("Pista2", 1, CourtType.SLOWCOURT);

        paddleManager.addCustomer(cliente1.getName(), cliente1.getSurname(), cliente1.getNif());
        paddleManager.addCustomer(cliente2.getName(), cliente2.getSurname(), cliente2.getNif());
        paddleManager.addCourt(court1.getName(), court1.getPrice(), court1.getType());
        paddleManager.addCourt(court2.getName(), court2.getPrice(), court2.getType());

        Customer primerCliente = paddleManager.customerList.get(0);
        Court segundaPista = paddleManager.courtList.get(1);

        System.out.println("Datos del primer cliente: ");
        System.out.println("Nombre: " + primerCliente.getName());
        System.out.println("Apellido: " + primerCliente.getSurname());
        System.out.println("NIF: " + primerCliente.getNif());

        System.out.println("Datos del segundo cliente: ");
        System.out.println("Nombre: " + cliente2.getName());
        System.out.println("Apellido: " + cliente2.getSurname());
        System.out.println("NIF: " + cliente2.getNif());

        System.out.println("Datos de la segunda pista: ");
        System.out.println("Nombre: " + court2.getName());
        System.out.println("Precio: " + court2.getPrice());
        System.out.println("Tipo: " + court2.getType());

        ArrayList<Customer> custList = new ArrayList<>();
        custList.add(primerCliente);
        ArrayList<Court> courList = new ArrayList<>();
        courList.add(segundaPista);
        paddleManager.reserve(custList, courList, 10, new Date());

        System.out.println("Datos de las reservas realizadas: ");
        for (Reservation reserva : paddleManager.reservations) {
            System.out.println("Clientes: ");
            for (Customer customer : reserva.getCustomers()) {
                System.out.println("Nombre: " + customer.getName() + ", Apellido: " + customer.getSurname() + ", NIF: " + customer.getNif());
            }
            System.out.println("Pista: ");
            for (Court court : reserva.getCourts()) {
                System.out.println("Nombre: " + court.getName() + ", Precio: " + court.getPrice() + ", Tipo: " + court.getType());
            }
            System.out.println("Día: " + reserva.getDate());
        }
    }
}
