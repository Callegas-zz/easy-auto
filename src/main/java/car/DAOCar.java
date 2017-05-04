package car;

import org.hibernate.Session;
import database.DAOMethods;
import database.HibernateUtil;
import useful.ClearScreen;

public class DAOCar extends DAOMethods{
    ClearScreen clearScreen = new ClearScreen();

    public Car find(String licencePlate){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Car carFind = (Car) session.load(Car.class, licencePlate);
        clearScreen.clear();
        System.out.println("\n\nC U R R E N T  C A R:\n\n" + carFind + "\n\n");
        session.getTransaction().commit();
        session.close();
        return carFind;
    }

    public static void clearScreen(){
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}

