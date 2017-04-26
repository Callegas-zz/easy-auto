package model;
import controller.HibernateUtil;
import controller.RegistrationCustomer;
import org.hibernate.Session;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class MainTest {
    public static void main(String[] args) {

        Address customer1Address = new Address(
                "Rio Grande Do Sul",
                "Canoas",
                "Negrinho Santos",
                1143,
                "92425-200");


        Date customer1Date = new Date();

        Customer customer1 = new Customer(
                "Fellipe Callegas",
                "02756972070",
                customer1Date,
                "callegas.f@gmail.com",
                "55 51 98573-7770",
                customer1Address);


        RegistrationCustomer registrationCustomer = new RegistrationCustomer();
        registrationCustomer.registerCustomer(customer1);



    }
}