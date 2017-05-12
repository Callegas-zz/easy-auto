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
    public void ifTryToRegisterInvalidCarYear(){
        Assert.assertEquals( new Long(0),new Long(registerCar.registerCarYear( 2003 )) );
    }

    @Test
    public void isReceivingCarEngineAndSetting(){
        registerCar.registerCarEngine(1.0);
        Assert.assertEquals(registerCar.car.getEngine(),(Double) 1.0);
    }

    @Test
    public void ifRegisterInvalidCarEngine(){
        Assert.assertEquals((Double) 0.0,registerCar.registerCarEngine(7.7));
    }

    @Test
    public void isReceivingCarPlacesAndSetting(){
        registerCar.registerCarPlaces( (byte) 5 );
        Assert.assertEquals( registerCar.car.getPlaces(), (byte) 5   );

    }

    @Test
    public void ifRegisterInvalidCarPlaces() {
        Assert.assertEquals( (byte) 0, registerCar.registerCarPlaces( (byte) 10 ) );
    }

    @Test
    public void isReceivingCarKMAndSetting(){
        registerCar.registerCarKM(50000L);
        Assert.assertEquals(new Long(registerCar.car.getKM()),new Long(50000));
    }

    @Test
    public void IfRegisterInvalidKm(){
        Assert.assertEquals(new Long(-1), new Long(registerCar.registerCarKM(-32L)));
    }

    @Test
    public void isReceivingCarRentPriceAndSetting(){
        registerCar.registerCarRentPrice(80.00);
        Assert.assertEquals(registerCar.car.getRentPriceDay(),(Double)80.00);
    }
}
