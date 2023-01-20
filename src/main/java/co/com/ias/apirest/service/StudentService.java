package co.com.ias.apirest.service;

import co.com.ias.apirest.dto.StudentDTO;
import co.com.ias.apirest.entity.Student;
import co.com.ias.apirest.repository.IStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService implements IStudentService{

    private final IStudentRepository iStudentRepository;

    public StudentService(IStudentRepository iStudentRepository) {
        this.iStudentRepository = iStudentRepository;
    }

    @Override
    public void saveStudent(StudentDTO studentDTO) {
        if(!this.iStudentRepository.existsById(studentDTO.getId())){
            this.iStudentRepository.save(new Student(studentDTO));
        }
    }

    @Override
    public List<StudentDTO> getStudents() {
        List<Student> list = (List<Student>) this.iStudentRepository.findAll();
        return list.stream().map(StudentDTO::new).collect(Collectors.toList());
    }

    @Override
    public StudentDTO findStudentById(StudentDTO studentDTO) {
        return new StudentDTO(this.iStudentRepository.findById(studentDTO.getId()));
    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {
        if(this.iStudentRepository.existsById(studentDTO.getId())){
            this.iStudentRepository.save(new Student(studentDTO));
        }
    }

    @Override
    public void deleteStudent(StudentDTO studentDTO) {
        if(this.iStudentRepository.existsById(studentDTO.getId())){
            this.iStudentRepository.deleteById(studentDTO.getId());
        }
    }
}
