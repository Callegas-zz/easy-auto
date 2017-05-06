package customer;
import car.Car;
import address.Address;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "customer", catalog = "easy_auto_db", uniqueConstraints = {
        @UniqueConstraint(columnNames = "customer_name"),
        @UniqueConstraint(columnNames = "customer_cpf"),
        @UniqueConstraint(columnNames = "customer_registration_date"),
        @UniqueConstraint(columnNames = "customer_email"),
        @UniqueConstraint(columnNames = "customer_telephone") })
public class Customer {

    private String name = "Not Register";
    private String cpf = "Not Register";
    private Date registrationDate = new Date();
    private String email = "Not Register";
    private String telephone = "Not Register";
    private Address address = new Address();

    private List<Car> cars = new ArrayList<Car>();

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "customer_car", catalog = "easy_auto_db", joinColumns = {
            @JoinColumn(name = "customer_cpf", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "car_licence_plate",
                    nullable = false, updatable = false) })
    public List<Car> getCars() {
        return this.cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Column(name = "customer_name", unique = true, nullable = false)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "customer_cpf", unique = true, nullable = false)
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "customer_registration_date")
    public Date getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(Date birthDate) {
        this.registrationDate = birthDate;
    }

    @Column(name = "customer_email", unique = true, nullable = false)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "customer_telephone", unique = true, nullable = false)
    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Embedded
    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Name: " + name +
                "\nCpf: " + cpf +
                "\nEmail: " + email +
                "\nTelephone: " + telephone;

    }



}