package eu.ensup.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String courseSubject;
    private float nbHours;

    public Course() {
    }

    public Course(int id, String courseSubject, float nbHours) {
        this.id = id;
        this.courseSubject = courseSubject;
        this.nbHours = nbHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseSubject() {
        return courseSubject;
    }

    public void setCourseSubject(String courseSubject) {
        this.courseSubject = courseSubject;
    }

    public float getNbHours() {
        return nbHours;
    }

    public void setNbHours(float nbHours) {
        this.nbHours = nbHours;
    }
}
