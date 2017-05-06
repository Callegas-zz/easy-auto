package service;

import car.Car;
import car.DAOCar;
import customer.Customer;
import customer.DAOCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rent {
    DAOCustomer daoCustomer = new DAOCustomer();
    DAOCar daoCar = new DAOCar();
    Scanner input = new Scanner(System.in);

    public void newRent(){
        System.out.println("Enter the customer cpf: ");
        String customerCpf = input.next();

        System.out.println("Enter the car licence plate: ");
        String carLicencePlate = input.next();

        Customer currentCustomer = daoCustomer.find(customerCpf);
        Car currentCar = daoCar.find(carLicencePlate);

        List<Car> cars = new ArrayList<>();
        cars.add(currentCar);
        currentCustomer.setCars(cars);

        daoCustomer.select(currentCustomer);

        System.out.println("C U S T O M E R: \n" + currentCustomer + "\n");
        System.out.println("C A R: \n" + currentCar + "\n");

    }

}
