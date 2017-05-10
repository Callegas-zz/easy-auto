package controller;

import model.Customer;
import database.DAOCustomer;
import model.Address;
import validations.ValidateFactory;
import view.ColorFactory;
import view.ItemMenuFactory;

import java.util.Scanner;

public class RegisterCustomer {


    Scanner input = new Scanner(System.in);
    DAOCustomer daoCustomer = new DAOCustomer();
    Customer customer = new Customer();
    Address address = new Address();

    ValidateFactory validateFactory = new ValidateFactory();
    ColorFactory colorFactory = new ColorFactory();
    ItemMenuFactory itemMenuFactory = new ItemMenuFactory();



    public void registerNewCustomer() {
        itemMenuFactory.facadeRegisterCustomer();
        System.out.print(colorFactory.ANSI_WHITE_BACKGROUND + colorFactory.ANSI_BLACK);

        registerCustomerNameInput("");
        registerCustomerCpfInput("");

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

    private void errorTest(String error){
        if (error != "")
            System.out.println(colorFactory.ANSI_RED + error + colorFactory.ANSI_RESET);

        System.out.print(colorFactory.ANSI_WHITE_BACKGROUND + colorFactory.ANSI_BLACK);
    }


    public String registerCustomerName(String name){
        if (validateFactory.validateName.isName(name)) {
            customer.setName(name);
            return customer.getName();
        }
        return "error";
    }

    public void registerCustomerNameInput(String error){

        errorTest(error);

        System.out.print("Enter the name:      ");
        String name;
        name = input.nextLine();
        registerCustomerName(name);

        if (registerCustomerName(name) == "error"){
            registerCustomerNameInput("Name isn't valid, try again: ");
        }
    }


    public String registerCustomerCpf(String cpf){
        if (validateFactory.validateCPF.isCPF(cpf)) {
            customer.setCpf(cpf);
            return customer.getCpf();
        }
        return "error";
    }

    public void registerCustomerCpfInput(String error){
        errorTest(error);

        System.out.print("Enter the cpf:       ");
        String cpf;
        cpf = input.nextLine();
        registerCustomerCpf(cpf);

        if (registerCustomerCpf(cpf) == "error"){
            registerCustomerCpfInput("Cpf isn't valid, try again: ");
        }
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

        System.out.print("Enter the cpf for find database: ");
        System.out.print(colorFactory.ANSI_RESET);

        daoCustomer.find(input.next());


    }

    public void removeCustomer() {
        itemMenuFactory.facadeDeleteCustomer();

        System.out.print(colorFactory.ANSI_WHITE_BACKGROUND + colorFactory.ANSI_BLACK);

        System.out.print("Enter the cpf for DELETE database: ");
        System.out.print(colorFactory.ANSI_RESET);


        daoCustomer.remove(input.next());




    }

}
