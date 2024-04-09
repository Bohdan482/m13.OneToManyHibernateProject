package CRUDServices;


public interface CRUDService {
    void create(Object entity);
    void delete(Object id);
    Object get(Object id);
}
