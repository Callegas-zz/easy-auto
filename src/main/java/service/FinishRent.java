package service;

import car.Car;
import car.DAOCar;
import customer.Customer;
import customer.DAOCustomer;
import view.ClearScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinishRent {
    DAOCustomer daoCustomer = new DAOCustomer();
    DAOCar daoCar = new DAOCar();
    Scanner input = new Scanner(System.in);
    ClearScreen clearScreen = new ClearScreen();

    public void finishRent(){
        System.out.println("Enter the customer cpf: ");
        String customerCpf = input.next();

        
        Customer currentCustomer = daoCustomer.find(customerCpf);
        List<Car> cars = new ArrayList<>();
        currentCustomer.setCars(cars);

        daoCustomer.update(currentCustomer);

    }
}
