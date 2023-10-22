package org.ulpgc.is1.control;
import com.sun.jdi.ClassType;
import org.ulpgc.is1.model.*;

import java.util.Date;
import java.util.ArrayList;

class Main {
    public static class PaddleManager {
        private Customer customer;
        private ArrayList<Customer> customerList;
        private Court court;
        private ArrayList<Court> courtList;

        public PaddleManager() {
            customerList = new ArrayList<>();
            courtList = new ArrayList<>();
        }

        public void addCustomer(String name, String surname, NIF nif) {
            Customer newCustomer = new Customer(name, surname, nif);
            customerList.add(newCustomer);
        }

        public void addCourt(String name, int price, CourtType type) {
            Court newCourt = new Court(name, price, type);
            courtList.add(newCourt);
        }

        public Customer getCustomer() {
            return this.customer;
        }

        public Court getCourt() {
            return this.court;
        }

        public void reserve(int price, Date date) {
            Reservation reservations = new Reservation(price, date);
        }
    }

    public static void main(String[] args) {
        PaddleManager paddleManager = new PaddleManager();
        init(paddleManager);
    }

    // sección g en el trabajo a continuación:
    public static void init(PaddleManager paddleManager) {
        // se añaden los clientes
        Member cliente1= new Member(11, "Nombre1" , "Apellido1", new NIF("1111111"));
        Customer cliente2 = new Customer("Nombre2", "Apellido2", new NIF("12SD34TT4"));


        // se añaden las pistas de pádel
        Court court1 = new Court("Pista1", 1, CourtType.FASTCOURT);
        Court court2 = new Court("Pista2", 1, CourtType.SLOWCOURT);

        // imprime los NIF válidos en pantalla
        System.out.println(cliente1.getNif());
        System.out.println(cliente2.getNif());

        // imprime los datos del primer cliente
        System.out.println("Datos del primer cliente: ");
        System.out.println("Puntos: " + cliente1.getPoints());
        System.out.println("Nombre: " + cliente1.getName());
        System.out.println("Apellido: " + cliente1.getSurname());
        System.out.println("NIF" + cliente1.getNif());

        // imprime los datos del primer cliente
        System.out.println("Datos del segundo cliente: ");
        System.out.println("Nombre: " + cliente2.getName());
        System.out.println("Apellido: " + cliente2.getSurname());
        System.out.println("NIF" + cliente2.getNif());

        // imprime los datos de la segunda pista
        System.out.println("Datos de la segunda pista: ");
        System.out.println("Nombre: " + court2.getName());
        System.out.println("Precio: " + court2.getPrice());
        System.out.println("Tipo: " + court2.getType());

        // crea una nueva reserva
        Reservation reserva = new Reservation();
        reserva.addCustomer(cliente1);
        reserva.addCourts(court2);

        // borra el segundo cliente
        paddleManager.customerList.remove(cliente2);

        // imprime el número de clientes en el club
        paddleManager.customerList.size();

        // imprime todas las reservas realizadas, el cliente que ha hecho la reserva, el nombre de la pista y el coste
        System.out.println("Datos de las reservas realizadas: ");
        System.out.println(reserva.getCustomers());
        System.out.println(reserva.getCourts());
        System.out.println(reserva.getDate());
    }
}
