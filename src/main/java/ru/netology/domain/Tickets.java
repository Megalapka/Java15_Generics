package ru.netology.domain;

public class Tickets implements Comparable<Tickets> {

    protected int id;
    protected int cost;
    protected String departureAirport;
    protected String arrivalAirport;
    protected int travelTime;   //in minutes

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

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int compareTo(Tickets o) {
        if (this.cost < o.cost) {
            return  -1;
        } else if (this.cost > o.cost) {
            return  1;
        } else {
            return 0;
        }
    }
}
