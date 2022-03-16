package eu.ensup.domaine;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Entite {

    @Id
    private int id;
    private String surname;
    private String mail;
    private String address;
    private String phoneNumber;

    public Entite(int id, String surname, String mailAddress, String address, String phoneNumber) {
        this.surname = surname;
        this.mail = mailAddress;
        this.address = address;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
