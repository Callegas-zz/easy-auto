package validators;

import org.junit.Assert;
import org.junit.Test;
import valitadors.ValidateFactory;

public class ValidateAddressNumberTest {
    ValidateFactory validateFactory = new ValidateFactory();

    @Test
    public void  whenRegisterValidAddressNumber(){
        Assert.assertTrue(validateFactory.validateAddressNumber.isValid(30));
    }

    @Test
    public void  whenRegisterInvalidAddressNumber(){
        Assert.assertFalse(validateFactory.validateAddressNumber.isValid(-20));
    }
}
