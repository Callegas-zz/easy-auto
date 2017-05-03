package DAO;

import model.Customer;

public interface DAOCustomerInterface {
    public void save(Customer customer);
    public void remove(String cpf);
    public Customer find(String cpf);
}
