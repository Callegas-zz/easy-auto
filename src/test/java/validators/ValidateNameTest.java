package validators;

import org.junit.Assert;
import org.junit.Test;
import valitadors.ValidateFactory;

public class ValidateNameTest {

    ValidateFactory validateFactory = new ValidateFactory();

    @Test
    public void whenRegisterValidName(){
        Assert.assertTrue(validateFactory.validateName.isValid("Fellipe Callegas"));
    }

    @Test
    public void whenRegisterInvalidName(){
        Assert.assertFalse(validateFactory.validateName.isValid("Fellipe; C4llegas"));
    }

}
