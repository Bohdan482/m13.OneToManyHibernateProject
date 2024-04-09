package CRUDServices;

import entities.Client;
import entities.Planet;
import entities.Ticket;

public interface OneToManyService {
    void create(long clientId, String fromPlanet, String toPlanet);
    void update(long id, long clientId);
    void delete(long id);

    Client getClient(long id);

    Planet getPlanet(String id);

    Ticket getTicket(long id);
}
