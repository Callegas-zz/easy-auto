package database;

import model.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class DAOCustomerTest {
    DAOCustomer daoCustomer = mock(DAOCustomer.class);

    @Test
    public void whenTryCreateValidCustomer(){
        Customer customer = new Customer();
        Customer customerEntity = new Customer();
        Mockito.when(daoCustomer.save(customer)).equals(customerEntity);
    }
    
}

