package ru.netology.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Tickets;

public class TicketsRepositoryTest {

    TicketsRepository repo = new TicketsRepository();
    Tickets ticket1 = new Tickets(1, 200, "LED", "VOG", 180);
    Tickets ticket2 = new Tickets(2, 2100, "VKT", "DME", 240);
    Tickets ticket3 = new Tickets(3, 100, "KGD", "NYM", 300);
    Tickets ticket4 = new Tickets(4, 1500, "NJC", "LED", 200);
    Tickets ticket5 = new Tickets(5, 200, "SGC", "TJM", 90);

    @BeforeEach
    public void setup() {
        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);
        repo.save(ticket4);
        repo.save(ticket5);
    }

    @Test
    public void shouldSaveTickets() {

        Tickets[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5};
        Tickets[] actual = repo.getTickets();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByID() {

        repo.removeById(3);

        Tickets[] expected = {ticket1, ticket2, ticket4, ticket5};
        Tickets[] actual = repo.getTickets();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindById() {

        Tickets expected = ticket3;
        Tickets actual = repo.findById(3);

        assertEquals(expected, actual);

    }
}
