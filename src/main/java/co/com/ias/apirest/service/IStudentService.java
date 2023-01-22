package co.com.ias.apirest.service;

import co.com.ias.apirest.dto.StudentDTO;

import java.util.List;

public interface IStudentService {

    void saveStudent(StudentDTO studentDTO);

    List<StudentDTO> getStudents();

    StudentDTO findStudentById(Integer id);

    void updateStudent(StudentDTO studentDTO);

    void deleteStudent(StudentDTO studentDTO);

    List<StudentDTO> findStudentsBySubject(Integer subjectId);
}
