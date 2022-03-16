package eu.ensup.domaine;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Entite {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String surname;
    private String mail;
    private String address;
    private String phone;
    private String role;

    public Entite(int id, String surname, String mail, String address, String phone, String role) {
        this.surname = surname;
        this.mail = mail;
        this.address = address;
        this.phone = phone;
        this.role = role;
    }

    public Entite() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
