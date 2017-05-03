package DAO;

import model.Car;

public interface DAOCarInterface {
    public void save(Car car);
    public void remove(String ID);
    public Car find(String id);
}
