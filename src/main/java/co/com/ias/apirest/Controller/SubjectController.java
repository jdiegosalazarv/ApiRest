package co.com.ias.apirest.Controller;

import co.com.ias.apirest.dto.SubjectDTO;
import co.com.ias.apirest.dto.TeacherDTO;
import co.com.ias.apirest.service.ISubjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    private final ISubjectService iSubjectService;

    public SubjectController(ISubjectService iSubjectService) {
        this.iSubjectService = iSubjectService;
    }

    @GetMapping
    public ResponseEntity<?> getAllSubjects(){
        return ResponseEntity.ok().body(this.iSubjectService.getSubjects());
    }

    @PostMapping
    public ResponseEntity<?> saveSubject(SubjectDTO subjectDTO){
        this.iSubjectService.saveSubject(subjectDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

//    @GetMapping
//    public ResponseEntity<?> getStudent(StudentDTO studentDTO){
//        return ResponseEntity.ok().body(this.iStudentService.findStudentById(studentDTO));
//    }

    @PutMapping
    public ResponseEntity<?> updateSubject(SubjectDTO subjectDTO){
        this.iSubjectService.updateSubject(subjectDTO);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteSubject(SubjectDTO subjectDTO){
        this.iSubjectService.deleteSubject(subjectDTO);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
