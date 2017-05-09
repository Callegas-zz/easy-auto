package model;
import model.Car;
import model.Address;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "customer", catalog = "easy_auto_db", uniqueConstraints = {
        @UniqueConstraint(columnNames = "customer_name"),
        @UniqueConstraint(columnNames = "customer_cpf"),
        @UniqueConstraint(columnNames = "customer_email"),
        @UniqueConstraint(columnNames = "customer_telephone") })
public class Customer {

    @Column(name = "customer_name", unique = true, nullable = false)
    private String name = "Not Register";

    @Id
    @Column(name = "customer_cpf", unique = true, nullable = false)
    private String cpf = "Not Register";

    @Column(name = "customer_email", unique = true, nullable = false)
    private String email = "Not Register";

    @Column(name = "customer_telephone", unique = true, nullable = false)
    private String telephone = "Not Register";

    @Embedded
    private Address address = new Address();

    @Column(name = "customer_has_car_rent", nullable = false)
    @Type(type="true_false")
    private boolean hasCarRent = false;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "customer_car", catalog = "easy_auto_db", joinColumns = {
            @JoinColumn(name = "customer_cpf", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "car_licence_plate", nullable = false, updatable = false) })
    private List<Car> cars = new ArrayList<Car>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isHasCarRent() {
        return hasCarRent;
    }

    public void setHasCarRent(boolean hasCarRent) {
        this.hasCarRent = hasCarRent;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Customer: " + this.name +
                "\nCpf: " + this.cpf +
                "\nEmail: " + this.email +
                "\nTelephone: " + this.telephone +
                "\nAddress: " + this.address +
                "\nCar rent: " + this.cars;
    }
}