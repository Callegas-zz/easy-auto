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
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Customer customerFind = (Customer) session.load(Customer.class, cpf);
        clearScreen.clear();
        itemMenuFactory.setSuccessLog(customerFind.toString());
        session.getTransaction().commit();
        session.close();
        return customerFind;
    }

    public static void clearScreen(){
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
