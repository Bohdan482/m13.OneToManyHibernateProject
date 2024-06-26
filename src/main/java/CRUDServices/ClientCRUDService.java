package CRUDServices;

import Storage.Hibernate.HibernateUtil;
import entities.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientCRUDService implements CRUDService{
    HibernateUtil util = HibernateUtil.getInstance();

    @Override
    public void create(Object entity) {
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        }
    }

    @Override
    public void delete(Object id) {
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Object entity = get(id);
            session.remove(entity);
            transaction.commit();
        }
    }

    @Override
    public Object get(Object id) {
        Object object;
        try (Session session = util.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            object = session.get(Client.class, id);
            transaction.commit();
        }
        return object;
    }
}