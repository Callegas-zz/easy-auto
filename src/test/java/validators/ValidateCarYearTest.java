package validators;

import org.junit.Assert;
import org.junit.Test;
import valitadors.ValidateFactory;

public class ValidateCarYearTest {
    ValidateFactory validateFactory = new ValidateFactory();

    @Test
    public void whenRegisterValidYear() {
        Assert.assertTrue(validateFactory.validateCarYear.isValid(2009));
    }

    @Test
    public void whenRegisterInvalidYear() {
        Assert.assertFalse(validateFactory.validateCarYear.isValid(2004));
    }
}
