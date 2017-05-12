package validators;

import org.junit.Assert;
import org.junit.Test;
import valitadors.ValidateFactory;

public class ValidateCarPlacesTest {

    ValidateFactory validateFactory = new ValidateFactory();

    @Test
    public void whenRegisterValidPlaces(){
        Assert.assertTrue(validateFactory.validateCarPlaces.isValid((byte) 4));
    }

    @Test
    public void whenRegisterMoreThanAllowedPlaces(){
        Assert.assertFalse(validateFactory.validateCarPlaces.isValid((byte) 8));
    }

    @Test
    public void whenRegisterLessThanAllowedPlaces(){
        Assert.assertFalse(validateFactory.validateCarPlaces.isValid((byte) 1));
    }

}
