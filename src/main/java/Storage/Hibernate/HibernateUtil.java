package Storage.Hibernate;

import entities.Client;
import entities.Planet;
import entities.Ticket;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final HibernateUtil INSTANCE;

    public static HibernateUtil getInstance() {
    return INSTANCE;
    }

    private final SessionFactory sessionFactory;

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    static {
        INSTANCE = new HibernateUtil();
    }

    private HibernateUtil() {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Ticket.class)
                .addAnnotatedClass(Planet.class)
                .buildSessionFactory();
    }
}
