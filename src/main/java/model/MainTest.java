package model;
import controller.HibernateUtil;
import org.hibernate.Session;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class MainTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Fellipe callegas");
        customer1.setEmail("callegas.f@gmail.com");
        customer1.setCpf("027.569.720-70");
        customer1.setTelephone("+55(51)95873-7770");

        Address customer1Address = new Address("Rio Grande Do Sul",
                "Canoas",
                "Negrinho Santos",
                1143,
                "92425-200");
        customer1.setAddress(customer1Address);

        Date customer1Date = new Date();
        customer1.setBirthDate(customer1Date);

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(customer1);
        session.getTransaction().commit();
        session.close();
        System.out.println("Registration was successful.");
    }
}