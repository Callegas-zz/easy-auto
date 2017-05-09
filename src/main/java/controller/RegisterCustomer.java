package controller;

import model.Customer;
import database.DAOCustomer;
import model.Address;
import view.ColorFactory;
import view.ItemMenuFactory;

import java.util.Scanner;

public class RegisterCustomer {


    Scanner input = new Scanner(System.in);
    DAOCustomer daoCustomer = new DAOCustomer();
    Customer customer = new Customer();
    Address address = new Address();

    ItemMenuFactory itemMenuFactory = new ItemMenuFactory();
    ColorFactory colorFactory = new ColorFactory();

    public void registerNewCustomer() {
        itemMenuFactory.facadeRegisterCustomer();

        System.out.print(colorFactory.ANSI_WHITE_BACKGROUND + colorFactory.ANSI_BLACK);

        System.out.print("Enter the name:      ");
        String name;
        name = input.nextLine();
        registerCustomerName(name);

        System.out.print("Enter the cpf:       ");
        String cpf;
        cpf = input.nextLine();
        registerCustomerCpf(cpf);

        System.out.print("Enter the email:     ");
        String email;
        email = input.nextLine();
        registerCustomerEmail(email);

        System.out.print("Enter the telephone: ");
        String telephone;
        telephone = input.nextLine();
        registerCustomerTelephone(telephone);

        System.out.print("Enter the zip code:  ");
        String zipCode;
        zipCode = input.nextLine();
        registerCustomerAddressZip(zipCode);

        System.out.print("Enter the State:     ");
        String state;
        state = input.nextLine();
        registerCustomerAddressState(state);

        System.out.print("Enter the City:      ");
        String city;
        city = input.nextLine();
        registerCustomerAddressCity(city);

        System.out.print("Enter the street:    ");
        String street;
        street = input.nextLine();
        registerCustomerAddressStreet(street);

        System.out.print("Enter the number:    ");
        registerCustomerAddresNumber(input.nextInt());

        System.out.println(colorFactory.ANSI_RESET);

        customer.setAddress(address);

        daoCustomer.save(customer);

    }


    public String registerCustomerName(String name){
        customer.setName(name);
        return customer.getName();
    }

    public String registerCustomerCpf(String cpf){
        customer.setCpf(cpf);
        return customer.getCpf();
    }

    public String registerCustomerEmail(String email) {
        customer.setEmail(email);
        return customer.getEmail();
    }

    public String registerCustomerTelephone(String telephone){
        customer.setTelephone(telephone);
        return customer.getTelephone();
    }

    public String registerCustomerAddressZip(String zip) {
        address.setZip(zip);
        return address.getZip();
    }

    public String registerCustomerAddressState(String state){
        address.setState(state);
        return address.getState();
    }

    public String registerCustomerAddressCity(String city){
        address.setCity(city);
        return address.getCity();
    }

    public String registerCustomerAddressStreet(String street){
        address.setStreet(street);
        return address.getStreet();
    }

    public int registerCustomerAddresNumber(Integer number){
        address.setNumber(number);
        return address.getNumber();
    }


    public void findCustomer() {
        itemMenuFactory.facadeFindCustomer();

        System.out.print(colorFactory.ANSI_WHITE_BACKGROUND + colorFactory.ANSI_BLACK);

        System.out.print("Enter the cpf for find customer: ");
        System.out.print(colorFactory.ANSI_RESET);

        daoCustomer.find(input.next());


    }

    public void removeCustomer() {
        itemMenuFactory.facadeDeleteCustomer();

        System.out.print(colorFactory.ANSI_WHITE_BACKGROUND + colorFactory.ANSI_BLACK);

        System.out.print("Enter the cpf for DELETE customer: ");
        System.out.print(colorFactory.ANSI_RESET);


        daoCustomer.remove(input.next());




    }

}
