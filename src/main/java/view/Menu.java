package view;

import controller.CustomerController;

import java.util.Scanner;

public class Menu {


    public void showMenu() {
        int selection = 999;
        Scanner input = new Scanner(System.in);
        CustomerController customerController = new CustomerController();
        System.out.println("\n\n        W E L L C O M E  T O  E A S Y  A U T O");
        System.out.println("                                       by callegas\n\n");

        while (selection != 0) {

            System.out.println("Choose from these choices: ");
            System.out.println("1 - Register Customer");
            System.out.println("2 - Remove Customer");
            System.out.println("3 - Find Customer");
            System.out.println("4 - Exit");
            System.out.print("\n\nchoose:");selection = input.nextInt();
            switch (selection) {
                case 0: {
                    System.out.println("\n\nT H A N K S  F O R  C O M M I N G!");
                }
                case 1: {

                    customerController.registerNewCustomer();
                    break;
                }
                case 2: {
                    customerController.removeCustomer();
                    break;
                }
                case 3: {
                    customerController.findCustomer();
                    break;
                }
                case 999: {

                }
                default: {
                    System.out.println("Invalid option!");
                }
            }
        }
    }



}
