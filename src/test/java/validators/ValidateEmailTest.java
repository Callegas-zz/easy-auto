package validators;


import org.junit.Assert;
import org.junit.Test;
import valitadors.ValidateFactory;

public class ValidateEmailTest {

    ValidateFactory validateFactory = new ValidateFactory();

    @Test
    public void WhenRegisterValidateEmail(){
        Assert.assertTrue(validateFactory.validateEmail.isValid("callegas.f@gmail.com"));
    }

    @Test
    public void WhenRegisterInvalidEmail(){
        Assert.assertFalse(validateFactory.validateEmail.isValid("callegas@.co"));
    }
}
