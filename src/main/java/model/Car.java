package model;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "car", catalog = "easy_auto_db")
public class Car {
    @Id
    @Column(name = "car_licence_plate", unique = true, nullable = false)
    private String licencePlate;

    private String manufacturer;
    private String model;
    private Integer year;
    private Long KM;
    private Double engine;
    private byte places;
    private String category;
    private Double rentPrice;
    @Type(type="true_false")
    private boolean available = true;
    @Type(type="true_false")
    private boolean armored;
    @Type(type="true_false")
    private boolean air;

    @Override
    public String toString() {
        return this.manufacturer + " " + this.model + " " +this.licencePlate;
    }

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

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    public byte getPlaces() {
        return places;
    }

    public void setPlaces(byte places) {
        this.places = places;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isArmored() {
        return armored;
    }

    public void setArmored(boolean armored) {
        this.armored = armored;
    }

    public boolean isAir() {
        return air;
    }

    public void setAir(boolean air) {
        this.air = air;
    }
}
