package ru.netology.domain;

import ru.netology.repository.TicketsRepository;

import java.util.Arrays;

public class TicketManager {

    private TicketsRepository repo;

    public TicketManager(TicketsRepository repo) {
        this.repo = repo;
    }

    public void add(Tickets ticket) {
        repo.save(ticket);
    }

    public Tickets[] getAllTickets() {
        return repo.getTickets();
    }

    public Tickets[] findTicketsByFromAirportAndToAirport(String departure, String arrival) {
        TicketsRepository repoResult = new TicketsRepository();
        for (Tickets ticket : repo.getTickets()) {
            if (conformity(ticket, departure, arrival)) {
                repoResult.save(ticket);
            }
        }

      Arrays.sort(repoResult.getTickets());
        return repoResult.getTickets();
    }

    public boolean conformity(Tickets ticket, String departure, String arrival) {
        return ticket.getDepartureAirport().contains(departure) && ticket.getArrivalAirport().contains(arrival);

    }


}
