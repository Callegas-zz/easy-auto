package validators;

import org.junit.Assert;
import org.junit.Test;
import valitadors.ValidateFactory;

public class ValidateZipCodeTest {

    ValidateFactory validateFactory = new ValidateFactory();

    @Test
    public void WhenITryToRegisterValidZipCode(){
        Assert.assertTrue(validateFactory.validateZipCode.isValid("92325-200"));
    }

    @Test
    public void WhenITryToRegisterInvalidZipCode(){
        Assert.assertFalse(validateFactory.validateZipCode.isValid("9937-32"));
    }



}
