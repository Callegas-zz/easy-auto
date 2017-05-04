package register;

import car.Car;
import car.DAOCar;
import customer.DAOCustomer;

import java.util.Locale;
import java.util.Scanner;

public class RegisterCar {

    Scanner input = new Scanner(System.in).useLocale(Locale.US);
    DAOCar daoCar = new DAOCar();
    Car car = new Car();

//    private Double motor;

    public void registerNewCar() {
        System.out.println("R E G I S T E R  N E W  C A R: ");

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

    private Integer registerCarYear(Integer year){
        car.setYear(year);
        return car.getYear();
    }

    private Double registerCarEngine(Double engine){
        car.setEngine(engine);
        return car.getEngine();
    }

    private Long registerCarKM(Long km){
        car.setKM(km);
        return car.getKM();
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
