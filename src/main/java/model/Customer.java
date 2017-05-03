package model;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


@Entity
public class Customer {

    private Integer id;
    private String name = "Not Register";
    private String cpf = "Not Register";
    private Date birthDate = new Date();
    private String email = "Not Register";
    private String telephone = "Not Register";
    private Address address = new Address();


    public Customer(String name, String cpf, Date birthDate, String email, String telephone, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
    }

    public Customer(){

    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nId: " + id +
                "\nCpf: " + cpf +
                "\nEmail: " + email +
                "\nTelephone: " + telephone;

    }

    @Id
    @GeneratedValue
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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