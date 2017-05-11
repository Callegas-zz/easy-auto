package database;

import model.Car;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DAOCarTest {
    DAOCar daoCar = mock(DAOCar.class);

    @Test
    public void whenTryCreateValidCar(){
        Car car = new Car();
        when(daoCar.save(car)).thenReturn("success");
        Assert.assertEquals(daoCar.save(car), "success");
    }

    @Test
    public void whenTryDeleteInvalidCar(){
        Car car = new Car();
        car.setLicencePlate("SDD-4135");
        when(daoCar.remove("MFI-4115")).thenReturn("error");
        Assert.assertEquals(daoCar.remove("MFI-4115"), "error");
    }

}
