package database;

public interface DAO {
    public void save(Object object);
    public void remove(String id);
    public Object find(String id);
}
