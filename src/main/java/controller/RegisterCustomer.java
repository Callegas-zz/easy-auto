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
        registerCustomerName(input.next());

        System.out.print("Enter the cpf:       ");
        registerCustomerCpf(input.next());

        System.out.print("Enter the email:     ");
        registerCustomerEmail(input.next());

        System.out.print("Enter the telephone: ");
        registerCustomerTelephone(input.next());

        System.out.print("Enter the zip code:  ");
        registerCustomerAddressZip(input.next());

        System.out.print("Enter the State:     ");
        registerCustomerAddressState(input.next());

        System.out.print("Enter the City:      ");
        registerCustomerAddressCity(input.next());

        System.out.print("Enter the street:    ");
        registerCustomerAddressStreet(input.next());

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
