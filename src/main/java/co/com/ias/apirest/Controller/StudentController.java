package co.com.ias.apirest.Controller;

import co.com.ias.apirest.dto.StudentDTO;
import co.com.ias.apirest.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final IStudentService iStudentService;

    public StudentController(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @GetMapping
    public ResponseEntity<?> getAllStudents(){
        return ResponseEntity.ok().body(this.iStudentService.getStudents());
    }

    @PostMapping
    public ResponseEntity<?> saveStudent(@RequestBody StudentDTO studentDTO){
        this.iStudentService.saveStudent(studentDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudent(@PathVariable Integer id){
        return ResponseEntity.ok().body(this.iStudentService.findStudentById(id));
    }

    @PutMapping
    public ResponseEntity<?> updateStudent(@RequestBody StudentDTO studentDTO){
        this.iStudentService.updateStudent(studentDTO);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteStudent(@RequestBody StudentDTO studentDTO){
        this.iStudentService.deleteStudent(studentDTO);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
