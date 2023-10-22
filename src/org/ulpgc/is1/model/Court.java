package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Court {
    private String name;
    private int price;
    private CourtType type;
    private List<Reservation> reservations; // Cambio de Court a Reservation

    public Court(String name, int price, CourtType type) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.reservations = new ArrayList<>();
    }

    // Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CourtType getType() {
        return type;
    }

    public void setType(CourtType type) {
        this.type = type;
    }
    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    // Método para eliminar reservas

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    // Método para obtener una reserva específica por índice

    public Reservation getReservation(int index) {
        if (index >= 0 && index < reservations.size()) {
            return reservations.get(index);
        } else {
            return null;
        }
    }
}
