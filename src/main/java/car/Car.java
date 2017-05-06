package car;
import customer.Customer;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "car", catalog = "easy_auto_db")
public class Car {
    private String licencePlate;
    private String manufacturer;
    private String model;
    private Integer year;
    private Long KM;
    private Double engine;
    private byte gearBox;
    private byte doors;
    private byte places;
    private String category;
    private Double rentPrice;
    private boolean oil;
    private boolean available;
    private boolean airbag;
    private boolean armored;
    private boolean abs;
    private boolean steering;
    private boolean air;
    private String seat;

    @Override
    public String toString() {
        return "Manufacturer: " + this.manufacturer +
                "\nModel: " + this.model +
                "\nLicence plate: " + this.licencePlate;
    }

    @Id
    @Column(name = "car_licence_plate", unique = true, nullable = false)
    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getKM() {
        return KM;
    }

    public void setKM(Long KM) {
        this.KM = KM;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double motor) {
        this.engine = motor;
    }

    public byte getGearBox() {
        return gearBox;
    }

    public void setGearBox(byte gearBox) {
        this.gearBox = gearBox;
    }

    public byte getDoors() {
        return doors;
    }

    public void setDoors(byte doors) {
        this.doors = doors;
    }

    public byte getPlaces() {
        return places;
    }

    public void setPlaces(byte places) {
        this.places = places;
    }

    @Type(type="true_false")
    public boolean isOil() {
        return oil;
    }

    public void setOil(boolean oil) {
        this.oil = oil;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Type(type="true_false")
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
    }

    @Type(type="true_false")
    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    @Type(type="true_false")
    public boolean isArmored() {
        return armored;
    }

    public void setArmored(boolean armored) {
        this.armored = armored;
    }

    @Type(type="true_false")
    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    @Type(type="true_false")
    public boolean isSteering() {
        return steering;
    }

    public void setSteering(boolean steering) {
        this.steering = steering;
    }

    @Type(type="true_false")
    public boolean isAir() {
        return air;
    }

    public void setAir(boolean air) {
        this.air = air;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
