package eu.ensup.service;

import eu.ensup.dao.StudentRepository;
import eu.ensup.domaine.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    private StudentRepository studentRepository;

    public HomeService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    // Inscription
    public void create(Student student){
        this.studentRepository.save(student); // Methode proposé par CrudRepository pour enregistrer une entité dans la base de données
    }

    // Connexion
    public Student findStudent(Student student){
        return this.studentRepository.findByMailAndPassword(student.getMail(), student.getPassword());
    }

}
