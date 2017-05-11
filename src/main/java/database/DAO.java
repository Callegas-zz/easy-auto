package database;

public interface DAO {
    public String save(Object object);
    public String update(Object object);
    public String remove(String id);
    public Object find(String id);
}
