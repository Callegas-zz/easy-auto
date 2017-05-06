package database;

import org.hibernate.Session;
import view.ClearScreen;

public abstract class DAOMethods implements DAO {
    ClearScreen clearScreen = new ClearScreen();

    @Override
    public void save(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        session.close();
        clearScreen.clear();
        System.out.println("\n\nR E G I S T R A T I O N  W A S  S U C C E S S F U L! \n\n");
    }

    @Override
    public void remove(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(find(id));
        session.getTransaction().commit();
        session.close();
        clearScreen.clear();
        System.out.println("\n\nR E M O V E D  S U C C E S S F U L L Y! \n\n");
    }

    public void update(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
        session.close();
        clearScreen.clear();
    }

}
