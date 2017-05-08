package controller;

import model.Car;
import database.DAOCar;
import model.Customer;
import database.DAOCustomer;
import view.ClearScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rent {
    DAOCustomer daoCustomer = new DAOCustomer();
    DAOCar daoCar = new DAOCar();
    Scanner input = new Scanner(System.in);
    ClearScreen clearScreen = new ClearScreen();

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

        if(currentCar.isAvailable() && !currentCustomer.isHasCarRent()) {
            currentCar.setAvailable(false);
            currentCustomer.setHasCarRent(true);
            daoCar.update(currentCar);
            daoCustomer.update(currentCustomer);

            System.out.println("R E N T  W A S  S U C C E F U L L Y!" + "\n");

            System.out.println("C U S T O M E R: \n" + currentCustomer + "\n");
            System.out.println("C A R: \n" + currentCar + "\n");
        } else {
            clearScreen.clear();
            System.out.println("S O R R Y, U N A V A I L A B L E  C A R  O R  C U S T O M E R!" + "\n");
        }

    }

    public void finishRent(){
        System.out.println("Enter the customer cpf: ");
        String customerCpf = input.next();
        Customer currentCustomer = daoCustomer.find(customerCpf);

        List<Car> carCustomer = currentCustomer.getCars();
        System.out.println(carCustomer.get(0).getLicencePlate());
        Car currentCar = daoCar.find(carCustomer.get(0).getLicencePlate());
        currentCar.setAvailable(true);
        daoCar.update(currentCar);

        List<Car> cars = new ArrayList<>();
        currentCustomer.setCars(cars);
        currentCustomer.setHasCarRent(false);
        daoCustomer.update(currentCustomer);

    }

}
