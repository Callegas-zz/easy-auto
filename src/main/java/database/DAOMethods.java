package database;

import org.hibernate.Session;
import view.ItemMenuFactory;
import view.ClearScreen;

public abstract class DAOMethods implements DAO {
    ClearScreen clearScreen = new ClearScreen();
    ItemMenuFactory itemMenuFactory = new ItemMenuFactory();

    @Override
    public void save(Object object) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(object);
            session.getTransaction().commit();
            session.close();
            clearScreen.clear();
            itemMenuFactory.setSuccessLog("Registration was successful!");
        }
        catch (Exception e){
            itemMenuFactory.setErrorLog("an error in database has occurred, please try again ");
        }
    }

    @Override
    public void remove(String id) {
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(find(id));
            session.getTransaction().commit();
            session.close();
            clearScreen.clear();
            itemMenuFactory.setSuccessLog("Removed successful!");
        }
        catch (Exception e) {
            itemMenuFactory.setErrorLog("an error in database has occurred, please try again ");
        }

    }

    public void update(Object object) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(object);
            session.getTransaction().commit();
            session.close();
            clearScreen.clear();
            itemMenuFactory.setSuccessLog("Successful!");
        }
        catch (Exception e){
            itemMenuFactory.setErrorLog("an error in database has occurred, please try again ");
        }
    }

}
