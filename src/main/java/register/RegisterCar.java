package register;

import car.Car;
import car.DAOCar;
import customer.DAOCustomer;

import java.util.Scanner;

public class RegisterCar {

    Scanner input = new Scanner(System.in);
    DAOCar daoCar = new DAOCar();
    Car car = new Car();

    public void registerNewCar() {
        System.out.println("R E G I S T E R  N E W  C A R: ");

        System.out.print("Enter the car manufacturer: ");
        registerCarManufacturer(input.next());

        System.out.print("Enter the car model: ");
        registerCarModel(input.next());

        System.out.print("Enter the car licence plate: ");
        registerCarLicencePlate(input.next());

        daoCar.save(car);
    }

    private String registerCarManufacturer(String manufacturer) {
        car.setManufacturer(manufacturer);
        return car.getManufacturer();
    }

    private String registerCarModel(String model) {
        car.setModel(model);
        return car.getModel();
    }

    private String registerCarLicencePlate(String licencePlate) {
        car.setLicencePlate(licencePlate);
        return car.getLicencePlate();
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
