package DAO;

import model.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAOCustomerImplements implements DAOCustomer {

    public void save(Customer customer){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
        session.close();
        System.out.println("\n\nR E G I S T R A T I O N  W A S  S U C C E S S F U L!");
    }

    public void remove(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(find(id));
        session.getTransaction().commit();
        session.close();
        System.out.println("\n\nR E M O V E D  S U C C E S S F U L L Y! \n\n\n");
    }


    public Customer find(Integer id){
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Customer customerFind = (Customer) session.load(Customer.class, id);
            System.out.println(customerFind + "\n\n3");
            session.getTransaction().commit();
            session.close();
            return customerFind;
        }

}
