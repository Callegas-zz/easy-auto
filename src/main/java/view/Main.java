package view;

import DAO.DAOCar;
import model.Car;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
       //menu.showMenu();
        Car car = new Car();
        car.setManufacturer("Ford");
        car.setModel("Fiesta");
        car.setLicencePlate("KGD-1755");
        DAOCar daoCar = new DAOCar();
        daoCar.save(car);
    }
}