package aav1.acces_dades.students;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aav1.acces_dades.model.Student;
import aav1.acces_dades.repository.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api")
public class CustomerStudent {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }
    
    @PostMapping("/students/batch")
    public int addStudent() {
        int numReg = studentRepository.save("Eric", "Jimenez", 19, "DAM", 2);
        return numReg;
    }
    
}
