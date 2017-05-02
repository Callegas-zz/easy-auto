package controller;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ilegra0281 on 02/05/2017.
 */
public class CustomerControllerTest {
    @Test
    public void teste1(){
        CustomerController cc = new CustomerController();
        cc.registerCustomerName("Fellipe");
        Assert.assertEquals(cc.customer.getName(),"Fellipe");
    }
}
