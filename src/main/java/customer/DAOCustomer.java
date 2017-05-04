package customer;

import database.DAOMethods;
import database.HibernateUtil;
import org.hibernate.Session;
import useful.ClearScreen;

public class DAOCustomer extends DAOMethods {
    ClearScreen clearScreen = new ClearScreen();

    public Customer find(String cpf){
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Customer customerFind = (Customer) session.load(Customer.class, cpf);
            clearScreen.clear();
            System.out.println("\n\nC U R R E N T  C U S T O M E R:\n" + customerFind + "\n\n");
            session.getTransaction().commit();
            session.close();
            return customerFind;
    }

    public static void clearScreen(){
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
