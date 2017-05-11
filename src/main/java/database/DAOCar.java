package database;

import model.Car;
import model.Customer;
import org.hibernate.Session;
import database.DAOMethods;
import database.HibernateUtil;
import view.ClearScreen;
import view.ItemMenuFactory;

public class DAOCar extends DAOMethods{
    ItemMenuFactory itemMenuFactory = new ItemMenuFactory();

    public Car find(String licencePlate){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Car carFind = (Car) session.load(Car.class, licencePlate);
            clearScreen.clear();
            itemMenuFactory.setSuccessLog(carFind.toString());
            session.getTransaction().commit();
            session.close();
            return carFind;
        }catch (Exception e){
            itemMenuFactory.setErrorLog("Not found!");
        }
        return new Car();
    }



}


