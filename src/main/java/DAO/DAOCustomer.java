package DAO;

import model.Customer;

public interface DAOCustomer {
    public void save(Customer customer);
    public void remove(Integer customer);
    public Customer find(Integer id);
}
