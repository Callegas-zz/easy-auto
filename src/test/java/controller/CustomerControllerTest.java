package controller;
import org.junit.Assert;
import org.junit.Test;

public class CustomerControllerTest {
    CustomerController customerController = new CustomerController();

    @Test
    public void isReceivingNameAndSetting(){
        customerController.registerCustomerName("Fellipe");
        Assert.assertEquals(customerController.customer.getName(), "Fellipe");
    }

    @Test
    public void isReceivingCpfAndSetting(){
        customerController.registerCustomerCpf("02756972000");
        Assert.assertEquals(customerController.customer.getCpf(), "02756972000");
    }

    @Test
    public void isReceivingEmailAndSetting(){
        customerController.registerCustomerEmail("callegas.f@gmail.com");
        Assert.assertEquals(customerController.customer.getEmail(),"callegas.f@gmail.com");
    }

    @Test
    public void isReceivingTelephoneAndSetting(){
        customerController.registerCustomerTelephone("(51)99999-9999");
        Assert.assertEquals(customerController.customer.getTelephone(), "(51)99999-9999");
    }

    @Test
    public void isReceivingAddressZipAndSetting(){
        customerController.registerCustomerAddressZip("92325-000");
        Assert.assertEquals(customerController.address.getZip(),"92325-000");
    }

    @Test
    public void isReceivingAddressStateAndSetting(){
        customerController.registerCustomerAddressState("California");
        Assert.assertEquals(customerController.address.getState(),"California");
    }

    @Test
    public void isReceivingAddressCityAndSetting(){
        customerController.registerCustomerAddressCity("Fresno");
        Assert.assertEquals(customerController.address.getCity(),"Fresno");
    }

    @Test
    public void isReceivingAddressStreetAndSetting(){
        customerController.registerCustomerAddressStreet("Empire");
        Assert.assertEquals(customerController.address.getStreet(),"Empire");
    }

    @Test
    public void isReceivingAddressNumberAndSetting(){
        customerController.registerCustomerAddresNumber(1855);
        Assert.assertEquals(new Long(customerController.address.getNumber()),new Long(1855));
    }

}
