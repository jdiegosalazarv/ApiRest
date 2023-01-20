package co.com.ias.apirest.service;

import co.com.ias.apirest.dto.StudentDTO;

import java.util.List;

public interface IStudentService {

    void saveStudent(StudentDTO studentDTO);

    List<StudentDTO> getStudents();

    StudentDTO findStudentById(StudentDTO studentDTO);

    void updateStudent(StudentDTO studentDTO);

    void deleteStudent(StudentDTO studentDTO);
}
