package controller;

import model.Car;
import database.DAOCar;
import model.Customer;
import database.DAOCustomer;
import view.ClearScreen;
import view.ColorFactory;
import view.ItemMenuFactory;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rent {
    DAOCustomer daoCustomer = new DAOCustomer();
    DAOCar daoCar = new DAOCar();
    Scanner input = new Scanner(System.in);
    ClearScreen clearScreen = new ClearScreen();
    ItemMenuFactory itemMenuFactory = new ItemMenuFactory();
    ColorFactory colorFactory = new ColorFactory();

    public void newRent(){
        itemMenuFactory.facadeNewRent();

        System.out.print(colorFactory.ANSI_WHITE_BACKGROUND + colorFactory.ANSI_BLACK);

        System.out.print("Enter the database cpf: ");
        String customerCpf = input.next();

        System.out.print("Enter the car licence plate: ");
        String carLicencePlate = input.next();

        System.out.print(colorFactory.ANSI_RESET);


        Customer currentCustomer = daoCustomer.find(customerCpf);
        Car currentCar = daoCar.find(carLicencePlate);
        itemMenuFactory.eraseLog();

        List<Car> cars = new ArrayList<>();
        cars.add(currentCar);
        currentCustomer.setCars(cars);

        if(currentCar.isAvailable() && !currentCustomer.isHasCarRent()) {
            currentCar.setAvailable(false);
            currentCustomer.setHasCarRent(true);
            daoCar.update(currentCar);
            daoCustomer.update(currentCustomer);

            itemMenuFactory.eraseLog();

            itemMenuFactory.setSuccessLog("Rent was successfully \n" + "Customer: " + currentCustomer + "\n" + "Car: " + currentCar);
        } else {
            clearScreen.clear();
            itemMenuFactory.setErrorLog("Sorry, unavailable car or customer!");
        }

    }

    public void finishRent(){
        try {
            itemMenuFactory.facadeFinishRent();

            System.out.print(colorFactory.ANSI_WHITE_BACKGROUND + colorFactory.ANSI_BLACK);

            System.out.print("Enter the database cpf: ");
            String customerCpf = input.next();

            System.out.print(colorFactory.ANSI_RESET);

            Customer currentCustomer = daoCustomer.find(customerCpf);
            itemMenuFactory.eraseLog();

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
        catch (Exception e){
            itemMenuFactory.eraseLog();
            itemMenuFactory.setErrorLog("Error, rent not exist");
        }

    }

}
