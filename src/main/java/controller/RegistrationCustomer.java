package controller;

import model.Address;
import model.Customer;
import org.hibernate.Session;

import java.util.Date;

public class RegistrationCustomer {

    public void registerCustomer(Customer customer1) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(customer1);
        session.getTransaction().commit();
        session.close();
        System.out.println("Registration was successful.");
    }

}
