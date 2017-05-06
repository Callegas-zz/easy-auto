package view;

import car.Car;
import customer.Customer;
import customer.DAOCustomer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();

//        DAOCustomer daoCustomer = new DAOCustomer();
//        Customer customer = new Customer();
//        customer.setCpf("123");
//        Car car = new Car();
//        car.setLicencePlate("abc");
//        List<Car> cars = new ArrayList<>();
//        cars.add(car);
//        customer.setCars(cars);
//
//        daoCustomer.save(customer);
    }
}