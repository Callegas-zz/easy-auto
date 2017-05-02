package DAO;

import javafx.beans.binding.When;
import model.Customer;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class DAOCustomerImplementsTest {


    @Test
    public void whenToSearchForExistingCustomer(){
        DAOCustomerImplements daoCustomerImplements = mock(DAOCustomerImplements.class);
        Customer customer = new Customer();
        customer.setId(1);
        when(daoCustomerImplements.find(1)).thenReturn(customer);
        Assert.assertNotNull(daoCustomerImplements.find(1));
    }

    @Test
    public void whenToSearchForNotRegisterCustomer(){
        DAOCustomerImplements daoCustomerImplements = mock(DAOCustomerImplements.class);
        Customer customer = new Customer();
        customer.setId(1);
        when(daoCustomerImplements.find(2)).thenReturn(new Customer());
        Assert.assertNotNull(daoCustomerImplements.find(2));
    }
}

