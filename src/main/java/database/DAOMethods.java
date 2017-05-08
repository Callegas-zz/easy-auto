package database;

import org.hibernate.Session;
import view.AsciiArt;
import view.ClearScreen;

public abstract class DAOMethods implements DAO {
    ClearScreen clearScreen = new ClearScreen();
    AsciiArt asciiArt = new AsciiArt();

    @Override
    public void save(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        session.close();
        clearScreen.clear();
        asciiArt.setSuccessLog("Registration was successful!");
    }

    @Override
    public void remove(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(find(id));
        session.getTransaction().commit();
        session.close();
        clearScreen.clear();
        asciiArt.setSuccessLog("Removed successful!");
    }

    public void update(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
        session.close();
        clearScreen.clear();
        asciiArt.setSuccessLog("Successful!");
    }

}
