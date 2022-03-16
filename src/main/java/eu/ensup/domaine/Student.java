package eu.ensup.domaine;

import javax.persistence.Entity;

@Entity
public class Student extends Person{
    private String dateofbirth;

    public Student(){
        super();
    }

    public Student(int id, String surname, String mail, String address, String phone, String role, String firstname, String password, String dateofbirth) {
        super(id, surname, mail, address, phone, role, firstname, password);
        this.dateofbirth = dateofbirth;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
}
