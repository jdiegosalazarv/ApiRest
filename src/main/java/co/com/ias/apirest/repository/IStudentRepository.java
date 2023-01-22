package co.com.ias.apirest.repository;

import co.com.ias.apirest.dto.StudentDTO;
import co.com.ias.apirest.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IStudentRepository extends CrudRepository<Student, Integer> {

    List<StudentDTO> findBySubjectId(Integer id);
}
