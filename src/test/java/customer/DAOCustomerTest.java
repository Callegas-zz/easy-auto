package customer;

import database.DAOCustomer;
import model.Customer;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class DAOCustomerTest {


    @Test
    public void whenToSearchForExistingCustomer(){
        DAOCustomer daoCustomerImplements = mock(DAOCustomer.class);
        Customer customer = new Customer();
        customer.setCpf("12345");
        when(daoCustomerImplements.find("1")).thenReturn(customer);
        Assert.assertNotNull(daoCustomerImplements.find("12345"));
    }

    @Test
    public void whenToSearchForNotRegisterCustomer(){
        DAOCustomer daoCustomerImplements = mock(DAOCustomer.class);
        Customer customer = new Customer();
        customer.setCpf("12345");
        when(daoCustomerImplements.find("54321")).thenReturn(new Customer());
        Assert.assertNotNull(daoCustomerImplements.find("54321"));
    }
}

