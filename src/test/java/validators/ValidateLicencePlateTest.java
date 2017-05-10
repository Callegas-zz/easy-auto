package validators;

import org.junit.Assert;
import org.junit.Test;
import valitadors.ValidateFactory;

public class ValidateLicencePlateTest {

    ValidateFactory validateFactory = new ValidateFactory();

    @Test
    public void whenRegisterValidLicencePlate(){
        Assert.assertTrue(validateFactory.validateLicencePlate.isValid("MFI-4115"));
    }

    @Test
    public void whenRegisterInvalidLicencePlate(){
        Assert.assertFalse(validateFactory.validateLicencePlate.isValid("licc-415"));
    }
}
