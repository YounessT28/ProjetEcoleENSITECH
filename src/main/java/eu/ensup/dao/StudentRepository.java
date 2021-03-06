package eu.ensup.dao;

import eu.ensup.domaine.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer>  {

    // User findByMailAndPassword(String mail, String password);
    Student findByMailAndPassword(String mail, String password);

    List<Student> findByRole(String role);
}
