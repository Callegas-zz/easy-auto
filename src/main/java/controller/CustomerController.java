package controller;

import DAO.DAOCustomerImplements;
import model.Address;
import model.Customer;

import java.util.Scanner;

public class CustomerController {

    Scanner input = new Scanner(System.in);
    Customer customer = new Customer();
    Address address = new Address();


    public void registerNewCustomer() {
        System.out.println("R E G I S T E R  N E W  C U S T O M E R");

        System.out.print("Enter the name: ");
        registerCustomerName(input.next());

        System.out.print("Enter the cpf: ");
        registerCustomerCpf(input.next());

        System.out.print("Enter the email: ");
        registerCustomerEmail(input.next());

        System.out.print("Enter the telephone: ");
        registerCustomerTelephone(input.next());


        System.out.print("Enter your zip code: ");
        registerCustomerAddressZip(input.next());

        System.out.print("Enter the State: ");
        registerCustomerAddressState(input.next());

        System.out.print("Enter the City: ");
        registerCustomerAddressCity(input.next());

        System.out.print("Enter the street: ");
        registerCustomerAddressStreet(input.next());

        System.out.print("Enter the number: ");
        registerCustomerAddresNumber(input.nextInt());


        customer.setAddress(address);


        DAOCustomerImplements daoCustomerImplements = new DAOCustomerImplements();
        daoCustomerImplements.save(customer);

        System.out.println("\n\nR E G I S T R A T I O N  W A S  S U C C E S S F U L!");
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

    public int registerCustomerAddresNumber(int number){
        address.setNumber(number);
        return address.getNumber();
    }

}
