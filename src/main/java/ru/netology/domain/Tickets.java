package ru.netology.domain;

public class Tickets implements Comparable<Tickets> {

    protected int id;
    protected int cost;
    protected String departureAirport;
    protected String arrivalAirport;
    protected int travelTime;   // minutes

    public Tickets(int id, int cost, String departureAirport, String arrivalAirport, int travelTime) {
        this.id = id;
        this.cost = cost;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.travelTime = travelTime;
    }

    public int getId() {
        return id;
    }


    public int getCost() {
        return cost;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }


    public String getArrivalAirport() {
        return arrivalAirport;
    }


    @Override
    public int compareTo(Tickets o) {
        return cost - o.getCost();
    }
}
