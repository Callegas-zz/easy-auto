package controller;
import org.junit.Assert;
import org.junit.Test;

public class RegisterCustomerTest {
    RegisterCustomer registerCustomer = new RegisterCustomer();

    @Test
    public void isReceivingNameAndSetting(){
        registerCustomer.registerCustomerName("Fellipe");
        Assert.assertEquals(registerCustomer.customer.getName(), "Fellipe");
    }

    @Test
    public void ifTryRegisterNotValidName(){
        Assert.assertEquals("error",registerCustomer.registerCustomerName("f3llipe"));
    }

    @Test
    public void isReceivingCpfAndSetting(){
        registerCustomer.registerCustomerCpf("02756972070");
        Assert.assertEquals(registerCustomer.customer.getCpf(), "02756972070");
    }

    @Test
    public void ifCpfIsWrongShouldNotRegisterIt(){
        Assert.assertEquals("error", registerCustomer.registerCustomerCpf("03055") );
    }

    @Test
    public void isReceivingEmailAndSetting(){
        registerCustomer.registerCustomerEmail("callegas.f@gmail.com");
        Assert.assertEquals(registerCustomer.customer.getEmail(),"callegas.f@gmail.com");
    }

    @Test
    public void ifTryToRegisterInvalidEmail(){
        Assert.assertEquals("error", registerCustomer.registerCustomerEmail("callegas.com@"));
    }

    @Test
    public void isReceivingTelephoneAndSetting(){
        registerCustomer.registerCustomerTelephone("(51)99999-9999");
        Assert.assertEquals(registerCustomer.customer.getTelephone(), "(51)99999-9999");
    }

    @Test
    public void isReceivingAddressZipAndSetting(){
        registerCustomer.registerCustomerAddressZip("92325-000");
        Assert.assertEquals(registerCustomer.address.getZip(),"92325-000");
    }

    @Test
    public void isReceivingAddressStateAndSetting(){
        registerCustomer.registerCustomerAddressState("California");
        Assert.assertEquals(registerCustomer.address.getState(),"California");
    }

    @Test
    public void ifTryRegisterNotValidState(){
        Assert.assertEquals("error",registerCustomer.registerCustomerAddressState("R1o"));
    }

    @Test
    public void isReceivingAddressCityAndSetting(){
        registerCustomer.registerCustomerAddressCity("Fresno");
        Assert.assertEquals(registerCustomer.address.getCity(),"Fresno");
    }

    @Test
    public void ifTryRegisterNotValidCity(){
        Assert.assertEquals("error",registerCustomer.registerCustomerAddressCity("ipa.nema5"));
    }

    @Test
    public void isReceivingAddressStreetAndSetting(){
        registerCustomer.registerCustomerAddressStreet("Empire");
        Assert.assertEquals(registerCustomer.address.getStreet(),"Empire");
    }

    @Test
    public void ifTryRegisterNotValidStreet(){
        Assert.assertEquals("error",registerCustomer.registerCustomerAddressStreet("samp.@ri"));
    }

    @Test
    public void isReceivingAddressNumberAndSetting(){
        registerCustomer.registerCustomerAddressNumber(1855);
        Assert.assertEquals(new Long(registerCustomer.address.getNumber()),new Long(1855));
    }

}
