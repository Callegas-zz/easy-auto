package controller;

import org.junit.Assert;
import org.junit.Test;

public class registerCarTest {
    RegisterCar registerCar = new RegisterCar();

    @Test
    public void isReceivingManufacturerAndSetting(){
        registerCar.registerCarManufacturer("Ford");
        Assert.assertEquals(registerCar.car.getManufacturer(), "Ford");
    }

    @Test
    public void ifTryToRegisterInvalidManufacturer(){
        Assert.assertEquals( "error", registerCar.registerCarManufacturer( "F1t.@" ) );
    }

    @Test
    public void isReceivingModelAndSetting(){
        registerCar.registerCarModel("Fiesta");
        Assert.assertEquals(registerCar.car.getModel(),"Fiesta");
    }

    @Test
    public void ifTryToRegisterInvalidModel(){
        Assert.assertEquals( "error", registerCar.registerCarModel( "f1est." ) );
    }

    @Test
    public void isReceivingLicencePlateAndSetting(){
        registerCar.registerCarLicencePlate("MFI-4115");
        Assert.assertEquals(registerCar.car.getLicencePlate(),"MFI-4115");
    }

    @Test
    public void ifTryToRegisterInvalidLicencePlate(){
        Assert.assertEquals( "error", registerCar.registerCarLicencePlate( "jj-33" ) );
    }

    @Test
    public void isReceivingCarYearAndSetting(){
        registerCar.registerCarYear(2008);
        Assert.assertEquals(new Long(registerCar.car.getYear()), new Long(2008));
    }

    @Test
    public void isReceivingCarEngineAndSetting(){
        registerCar.registerCarEngine(1.0);
        Assert.assertEquals(registerCar.car.getEngine(),(Double) 1.0);
    }

    @Test
    public void isReceivingCarKMAndSetting(){
        registerCar.registerCarKM(50000L);
        Assert.assertEquals(java.util.Optional.ofNullable(registerCar.car.getKM()),50000L);
    }

    @Test
    public void isReceivingCarRentPriceAndSetting(){
        registerCar.registerCarRentPrice(80.00);
        Assert.assertEquals(registerCar.car.getRentPrice(),(Double)80.00);
    }
}
