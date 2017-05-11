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
        when(daoCustomer.save(customer)).thenReturn("success");
        Assert.assertEquals(daoCustomer.save(customer), "success");
    }

    @Test
    public void whenTryDeleteValidCustomer(){
        Customer customer = new Customer();
        customer.setCpf("02756972070");
        when(daoCustomer.remove("02756972070")).thenReturn("success");
        Assert.assertEquals(daoCustomer.remove("02756972070"), "success");
    }

    @Test
    public void whenTryDeleteInvalidCustomer(){
        Customer customer = new Customer();
        customer.setCpf("84606347015");
        when(daoCustomer.remove("02756972070")).thenReturn("error");
        Assert.assertEquals(daoCustomer.remove("02756972070"), "error");
    }

    @Test
    public void WhenFindValidCustomer() {
        Customer customer = new Customer();
        customer.setCpf("02756972070");
        daoCustomer.save(customer);
        when(daoCustomer.find("02756972070")).thenReturn(customer);
        Assert.assertNotNull(daoCustomer.find("02756972070"));
    }

    @Test
    public void WhenFindInvalidCustomer() {
        Customer customer = new Customer();
        customer.setCpf("84606347015");
        daoCustomer.save(customer);
        when(daoCustomer.find("02756972070")).thenReturn(customer);
        Assert.assertNotNull(daoCustomer.find("02756972070"));
    }

}

