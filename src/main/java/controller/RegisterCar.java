package controller;

import model.Car;
import database.DAOCar;
import view.ItemMenuFactory;

import java.util.Locale;
import java.util.Scanner;

public class RegisterCar {
    ItemMenuFactory itemMenuFactory = new ItemMenuFactory();
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
    DAOCar daoCar = new DAOCar();
    Car car = new Car();

    public void registerNewCar() {
        itemMenuFactory.facadeRegisterCar();

        System.out.print("Enter the car manufacturer: ");
        registerCarManufacturer(input.next());

        System.out.print("Enter the car model: ");
        registerCarModel(input.next());

        System.out.print("Enter the car licence plate: ");
        registerCarLicencePlate(input.next());

        System.out.print("Enter the car year: ");
        registerCarYear(input.nextInt());

        System.out.print("Enter the car engine: ");
        registerCarEngine(input.nextDouble());

        System.out.print("Enter the KM car: ");
        registerCarKM(input.nextLong());

        System.out.print("Enter the rent price for this car: ");
        registerCarRentPrice(input.nextDouble());

        daoCar.save(car);
    }

    public String registerCarManufacturer(String manufacturer) {
        car.setManufacturer(manufacturer);
        return car.getManufacturer();
    }

    public String registerCarModel(String model) {
        car.setModel(model);
        return car.getModel();
    }

    public String registerCarLicencePlate(String licencePlate) {
        car.setLicencePlate(licencePlate);
        return car.getLicencePlate();
    }

    public Integer registerCarYear(Integer year){
        car.setYear(year);
        return car.getYear();
    }

    public Double registerCarEngine(Double engine){
        car.setEngine(engine);
        return car.getEngine();
    }

    public Long registerCarKM(Long km){
        car.setKM(km);
        return car.getKM();
    }

    public Double registerCarRentPrice(Double price){
        car.setRentPrice(price);
        return car.getRentPrice();
    }

    public void removeCar() {
        System.out.println("D E L E T E  C A R");
        System.out.print("Enter the licence plate for DELETE car: ");
        daoCar.remove(input.next());
    }

    public void findCar() {
        System.out.println("F I N D  C U S T O M E R:");
        System.out.print("Enter the licence plate for find car: ");
        daoCar.find(input.next());
    }
}
