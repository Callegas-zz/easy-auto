package customer;
import useful.Address;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Customer {

    private String name = "Not Register";
    private String cpf = "Not Register";
    private Date registrationDate = new Date();
    private String email = "Not Register";
    private String telephone = "Not Register";
    private Address address = new Address();

    @Override
    public String toString() {
        return "Name: " + name +
                "\nCpf: " + cpf +
                "\nEmail: " + email +
                "\nTelephone: " + telephone;

    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "registration_date")
    public Date getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(Date birthDate) {
        this.registrationDate = birthDate;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
}