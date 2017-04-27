package view;

import DAO.DAOCustomerImplements;
import model.Address;
import model.Customer;

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
                    register();
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

    public void register() {
        System.out.println("R E G I S T E R  N E W  C U S T O M E R");

        Customer customer = new Customer();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");
        customer.setName(input.next());
        System.out.print("Enter the cpf: ");
        customer.setCpf(input.next());
        System.out.print("Enter the email: ");
        customer.setEmail(input.next());
        System.out.print("Enter the telephone: ");
        customer.setTelephone(input.next());

        Address address = new Address();
        System.out.print("Enter your zip code: ");
        address.setZip(input.next());
        System.out.print("Enter the State: ");
        address.setState(input.next());
        System.out.print("Enter the City: ");
        address.setCity(input.next());
        System.out.print("Enter the street: ");
        address.setStreet(input.next());
        System.out.print("Enter the number: ");
        address.setNumber(input.nextInt());
        customer.setAddress(address);


        DAOCustomerImplements daoCustomerImplements = new DAOCustomerImplements();
        daoCustomerImplements.save(customer);
    }


}
