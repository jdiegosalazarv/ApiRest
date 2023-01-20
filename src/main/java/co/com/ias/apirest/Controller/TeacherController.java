package co.com.ias.apirest.Controller;


import co.com.ias.apirest.dto.TeacherDTO;
import co.com.ias.apirest.service.ITeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final ITeacherService iTeacherService;

    public TeacherController(ITeacherService iTeacherService) {
        this.iTeacherService = iTeacherService;
    }

    @GetMapping
    public ResponseEntity<?> getAllTeachers(){
        return ResponseEntity.ok().body(this.iTeacherService.getTeachers());
    }

    @PostMapping
    public ResponseEntity<?> saveTeacher(TeacherDTO teacherDTO){
        this.iTeacherService.saveTeacher(teacherDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

//    @GetMapping
//    public ResponseEntity<?> getStudent(StudentDTO studentDTO){
//        return ResponseEntity.ok().body(this.iStudentService.findStudentById(studentDTO));
//    }

    @PutMapping
    public ResponseEntity<?> updateTeacher(TeacherDTO teacherDTO){
        this.iTeacherService.updateTeacher(teacherDTO);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteStudent(TeacherDTO teacherDTO){
        this.iTeacherService.deleteTeacher(teacherDTO);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
