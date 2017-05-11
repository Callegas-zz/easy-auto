package validators;


import org.junit.Assert;
import org.junit.Test;
import valitadors.ValidateFactory;

public class ValidateCPFTest {
    ValidateFactory validateFactory = new ValidateFactory();

    @Test
    public void whenRegisterValidCpf(){
        Assert.assertTrue(validateFactory.validateCPF.isValid("84606347015"));
    }

    @Test
    public void whenRegisterInvalidCpf(){
        Assert.assertFalse(validateFactory.validateCPF.isValid("846047015"));
    }
}
