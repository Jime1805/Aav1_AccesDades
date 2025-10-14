package aav1.acces_dades.students;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public abstract class CustomerStudent {

    @GetMapping("/student")
    public String getStudent() {
        return "Endpoint get";
    }
    
    @PostMapping("/batch")
    public String postStudent(@RequestBody String entity) {
        
        return "Endpoint post";
    }
    
}
