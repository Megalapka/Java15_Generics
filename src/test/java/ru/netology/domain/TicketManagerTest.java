package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.repository.TicketsRepository;

public class TicketManagerTest {
    TicketsRepository repo = new TicketsRepository();
    TicketManager manager = new TicketManager(repo);
    Tickets ticket1 = new Tickets(1, 200, "LED", "VOG", 300);
    Tickets ticket2 = new Tickets(2, 2100, "VKT", "DME", 240);
    Tickets ticket3 = new Tickets(3, 100, "KGD", "NYM", 300);
    Tickets ticket4 = new Tickets(4, 1500, "LED", "VOG", 200);
    Tickets ticket5 = new Tickets(5, 200, "SGC", "TJM", 90);
    Tickets ticket6 = new Tickets(6, 900, "LED", "VOG", 250);

    @BeforeEach
    public void setup() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
    }

    @Test
    public void shouldGetAllTickets() {
        Tickets[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6};
        Tickets[] actual = manager.getAllTickets();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByDepartureAirportAndArrivalAirport() {
        Tickets[] expected = {ticket1, ticket4, ticket6};
        Tickets[] actual = manager.findTicketsByDepartureAirportAndArrivalAirport("LED", "VOG");
        assertArrayEquals(expected, actual);
    }
}
