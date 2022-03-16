package eu.ensup.domaine;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends Entite {
    private String firstname;
    private String password;

    public Person(int id, String surname, String mailAddress, String address, String phoneNumber, String firstname, String password) {
        super(id, surname, mailAddress, address, phoneNumber);
        this.firstname = firstname;
        this.password = password;
    }

    public Person() {
        super();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
