package view;

import register.RegisterCar;
import register.RegisterCustomer;
import service.Rent;

import java.util.Scanner;

public class Menu {

    AsciiArt asciiArt = new AsciiArt();
    ClearScreen clearScreen = new ClearScreen();
    Scanner input = new Scanner(System.in);
    RegisterCustomer registerCustomer = new RegisterCustomer();
    RegisterCar registerCar = new RegisterCar();
    Rent rent = new Rent();



    public void showMenu() {
        clearScreen.clear();
        int selection = 999;

        asciiArt.asciiLogo();
        asciiArt.asciiMainMenu();
        selection = input.nextInt();
        switch (selection){
            case 0: {
                clearScreen.clear();
                asciiArt.asciiExitMessage();
                System.exit(0);
                break;
            }
            case 1: {
                menuCustomer();
                break;
            }
            case 2: {
                menuCar();
                break;
            }
            case 3: {
                menuService();
                break;
            }
            default:
                System.out.println("Invalid option!");
        }
    }



    public void menuCustomer(){
        clearScreen.clear();
        int selection1 = 999;
        while (selection1 != 0) {
            System.out.println("C U S T O M E R  S E S S I O N\n");
            System.out.println("1 - Register a new customer");
            System.out.println("2 - Remove customer");
            System.out.println("3 - Find customer");
            System.out.println("0 - Return to main menu");
            System.out.print("\n\nenter the option:");
            selection1 = input.nextInt();
            switch (selection1) {
                case 0: {
                    showMenu();
                    break;
                }
                case 1: {
                    clearScreen.clear();
                    registerCustomer.registerNewCustomer();
                    break;
                }
                case 2: {
                    clearScreen.clear();
                    registerCustomer.removeCustomer();
                    break;
                }
                case 3: {
                    clearScreen.clear();
                    registerCustomer.findCustomer();
                    break;
                }
                default:
                    System.out.println("Invalid option!");
            }
        }
    }


    private void menuCar() {
        clearScreen.clear();
        int selection2 = 999;
        while (selection2 != 0) {
            System.out.println("C A R  S E S S I O N\n");
            System.out.println("1 - Register a new car");
            System.out.println("2 - Remove car");
            System.out.println("3 - Find car");
            System.out.println("0 - Return to main menu");
            System.out.print("\n\nenter the option:");
            selection2 = input.nextInt();
            switch (selection2) {
                case 0: {
                    showMenu();
                    break;
                }
                case 1: {
                    clearScreen.clear();
                    registerCar.registerNewCar();
                    break;
                }
                case 2: {
                    clearScreen.clear();
                    registerCar.removeCar();
                    break;
                }
                case 3: {
                    clearScreen.clear();
                    registerCar.findCar();
                    break;
                }
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private void menuService(){
        clearScreen.clear();
        int selection3 = 999;
        while (selection3 != 0) {
            System.out.println("S E R V I C E  S E S S I O N\n");
            System.out.println("1 - New Rent");
            System.out.println("2 - Finish Rent");
            System.out.println("0 - Return to main menu");
            System.out.print("\n\nenter the option:");
            selection3 = input.nextInt();
            switch (selection3) {
                case 0: {
                    showMenu();
                    break;
                }
                case 1: {
                    clearScreen.clear();
                    rent.newRent();
                    break;
                }
                case 2: {
                    clearScreen.clear();
                    rent.finishRent();
                    break;
                }
                default:
                    System.out.println("Invalid option!");
            }
        }
    }


}
