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

    @Test
    public void whenToSearchForExistingCustomer(){

        Customer customer = new Customer();
        customer.setCpf("02756972070");
        when(daoCustomer.find("02756972070")).thenReturn(customer);
        Assert.assertNotNull(daoCustomer.find("02756972070"));
    }

    @Test
    public void whenToSearchForNotRegisterCustomer(){
        Customer customer = new Customer();
        customer.setCpf("02756972070");
        when(daoCustomer.find("84606347015")).thenReturn(new Customer());
    }

}

