package view;

import controller.CustomerController;

import java.util.Scanner;

public class Menu {


    public void showMenu() {
        int selection = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n        W E L L C O M E  T O  E A S Y  A U T O");
        System.out.println("                                       by callegas\n\n");

        while (selection != 4) {

            System.out.println("Choose from these choices: ");
            System.out.println("1 - Register Customer");
            System.out.println("2 - Remove Customer");
            System.out.println("3 - Find Customer");
            System.out.println("4 - Exit");
            System.out.print("\n\nchoose:");selection = input.nextInt();
            System.out.println("\n\n");
            switch (selection) {
                case 0: {

                }
                case 1: {
                    CustomerController customerController = new CustomerController();
                    customerController.registerNewCustomer();
                    break;
                }
                case 4: {
                    System.out.println("Thanks for coming!");
                }
                default: {
                    System.out.println("Invalid option!");
                }
            }
        }
    }



}
