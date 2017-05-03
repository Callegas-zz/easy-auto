package view;

import controller.CustomerController;

import java.util.Scanner;

public class Menu {

    ClearScreen clearScreen = new ClearScreen();
    Scanner input = new Scanner(System.in);
    CustomerController customerController = new CustomerController();


    public void showMenu() {
        clearScreen.clear();
        int selection = 999;
        System.out.println("\n\n        W E L L C O M E  T O  E A S Y  A U T O");
        System.out.println("                                       by callegas\n\n");
        System.out.println("Choose from these choices: \n");
        System.out.println("1 - Customer");
        System.out.println("0 - Exit");
        System.out.print("\n\nenter the option:");
        selection = input.nextInt();
        switch (selection){
            case 0: {
                clearScreen.clear();
                System.out.println("\n\nT H A N K S  F O R  C O M M I N G!");
                break;
            }
            case 1: {
                menuCustomer();
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
            System.out.println("1 - Register Customer");
            System.out.println("2 - Remove Customer");
            System.out.println("3 - Find Customer");
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
                    customerController.registerNewCustomer();
                    break;
                }
                case 2: {
                    clearScreen.clear();
                    customerController.removeCustomer();
                    break;
                }
                case 3: {
                    clearScreen.clear();
                    customerController.findCustomer();
                    break;
                }
                default:
                    System.out.println("Invalid option!");
            }
        }
    }


}
