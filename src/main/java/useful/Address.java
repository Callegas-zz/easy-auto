package useful;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String street = "Not Register";
    private String city = "Not Register";
    private String state = "Not Register";
    private String zip = "Not Register";
    private Integer number = 0;

    public Address(String state, String city, String street, Integer number, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.number = number;
    }

    public Address(){

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", number=" + number +
                '}';
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String streeth) {
        this.street = streeth;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}