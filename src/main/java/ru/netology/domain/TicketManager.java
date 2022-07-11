package ru.netology.domain;

import ru.netology.repository.TicketsRepository;

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

    public Tickets[] findTicketsByDepartureAirportAndArrivalAirport(String departure, String arrival) {
        TicketsRepository repoResult = new TicketsRepository();
        for (Tickets ticket : repo.getTickets()) {
            if (conformity(ticket, departure, arrival)) {
                repoResult.save(ticket);
            }
        }
        return repoResult.getTickets();
    }

    public boolean conformity(Tickets ticket, String departure, String arrival) {
        if ((ticket.getDepartureAirport().contains(departure)) & (ticket.getArrivalAirport().contains(arrival))) {
            return true;
        } else {
            return false;
        }
    }


}
