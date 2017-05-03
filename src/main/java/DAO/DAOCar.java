package DAO;

import model.Car;
import org.hibernate.Session;
import view.ClearScreen;

public class DAOCar implements DAOCarInterface{

    ClearScreen clearScreen = new ClearScreen();

   public void save(Car car) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(car);
        session.getTransaction().commit();
        session.close();
        clearScreen.clear();
        System.out.println("\n\nR E G I S T R A T I O N  W A S  S U C C E S S F U L!");
    }


    public void remove(String licencePlate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(find(licencePlate));
        session.getTransaction().commit();
        session.close();
        clearScreen.clear();
        System.out.println("\n\nR E M O V E D  S U C C E S S F U L L Y! \n\n\n");

    }


    public Car find(String cpf){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Car carFind = (Car) session.load(Car.class, cpf);
        clearScreen.clear();
        System.out.println("\n\nC U R R E N T  C A R:\n" + carFind + "\n\n");
        session.getTransaction().commit();
        session.close();
        return carFind;
    }
}
