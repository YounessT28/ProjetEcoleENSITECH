package eu.ensup.domaine;

import javax.persistence.Entity;

@Entity
public class Student extends Person{
    private String dateOfBirth;

    public Student(){
        super();
    }

    public Student(int id, String surname, String mailAddress, String address, String phoneNumber, String firstname, String password, String dateOfBirth) {
        super(id, surname, mailAddress, address, phoneNumber, firstname, password);
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
