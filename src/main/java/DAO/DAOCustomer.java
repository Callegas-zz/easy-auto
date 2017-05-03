package DAO;

import model.Customer;
import org.hibernate.Session;

public class DAOCustomer implements DAOCustomerInterface {

    public void save(Customer customer){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
        session.close();
        clearScreen();
        System.out.println("\n\nR E G I S T R A T I O N  W A S  S U C C E S S F U L!");
    }

    public void remove(String cpf) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(find(cpf));
        session.getTransaction().commit();
        session.close();
        clearScreen();
        System.out.println("\n\nR E M O V E D  S U C C E S S F U L L Y! \n\n\n");
    }


    public Customer find(String cpf){
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Customer customerFind = (Customer) session.load(Customer.class, cpf);
            clearScreen();
            System.out.println("\n\nC U R R E N T  C U S T O M E R:\n" + customerFind + "\n\n");
            session.getTransaction().commit();
            session.close();
            return customerFind;
        }

    public static void clearScreen(){
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
