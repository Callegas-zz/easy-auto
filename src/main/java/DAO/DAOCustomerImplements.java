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
        System.out.println("Registration was successful.");
    }

    public void remove(Customer customer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(customer);
        session.getTransaction().commit();
        session.close();
        System.out.println("Removed successfully! \n\n\n");
    }

    public Customer find(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Customer) session.load(Customer.class, id);

    }

}
