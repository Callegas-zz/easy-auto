package database;

import database.DAOMethods;
import database.HibernateUtil;
import model.Customer;
import org.hibernate.Session;
import view.ClearScreen;
import view.ItemMenuFactory;

public class DAOCustomer extends DAOMethods {
    ClearScreen clearScreen = new ClearScreen();
    ItemMenuFactory itemMenuFactory = new ItemMenuFactory();


    public Customer find(String cpf){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Customer customerFind = (Customer) session.load(Customer.class, cpf);
            clearScreen.clear();
            itemMenuFactory.setSuccessLog(customerFind.toString());
            session.getTransaction().commit();
            session.close();
            return customerFind;
        }catch (Exception e){
            itemMenuFactory.setErrorLog("An error in database has occurred, please try again ");
        }
        return new Customer();
    }

}
