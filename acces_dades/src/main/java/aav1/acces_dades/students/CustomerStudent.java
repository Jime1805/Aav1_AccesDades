package aav1.acces_dades.students;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class CustomerStudent {

    @GetMapping("/student")
    public String getStudent() {
        return "Endpoint get";
    }
    
    @PostMapping("/batch")
    public String postStudent() {
        
        return "Endpoint post";
    }
    
}
