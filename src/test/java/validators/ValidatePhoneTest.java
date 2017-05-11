package validators;

import org.junit.Assert;
import org.junit.Test;
import valitadors.ValidateFactory;

public class ValidatePhoneTest {

    ValidateFactory validateFactory = new ValidateFactory();

    @Test
    public void WhenITryToRegisterValidPhone(){
        Assert.assertTrue(validateFactory.validatePhone.isValid("(51) 8573-7775"));
    }

    @Test
    public void WhenITryToRegisterInvalidPhone(){
        Assert.assertFalse(validateFactory.validatePhone.isValid("82222222"));
    }
}
