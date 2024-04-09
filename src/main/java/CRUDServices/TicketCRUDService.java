package CRUDServices;

import Storage.Hibernate.HibernateUtil;
import entities.Client;
import entities.Planet;
import entities.Ticket;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TicketCRUDService implements OneToManyService{
    HibernateUtil util = new HibernateUtil().getInstance();
    @Override
    public void create(long clientId, String fromPlanet, String toPlanet) {
        Ticket ticket = new Ticket();
        Client client = getClient(clientId);
        Planet from = getPlanet(fromPlanet);
        Planet to = getPlanet(toPlanet);
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            ticket.setClient(client);
            ticket.setFrom(from);
            ticket.setTo(to);
            session.persist(ticket);
            transaction.commit();
        }
    }

    @Override
    public void update(long id, long clientId) {
        Ticket ticket = getTicket(id);
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.evict(ticket);
            ticket.setClient(getClient(clientId));
            session.merge(ticket);
            transaction.commit();
        }
    }

    @Override
    public void delete(long id) {
        Ticket ticket = getTicket(id);
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(ticket);
            transaction.commit();
        }
    }

    @Override
    public Client getClient(long id) {
       Client client;
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            client = session.get(Client.class, id);
            transaction.commit();
        }
        return client;
    }

    @Override
    public Planet getPlanet(String id) {
        Planet planet;
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            planet = session.get(Planet.class, id);
            transaction.commit();
        }
        return planet;
    }

    public Ticket getTicket(long id){
        Ticket ticket;
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            ticket = session.get(Ticket.class, id);
            transaction.commit();
        }
        return ticket;
    }
}
