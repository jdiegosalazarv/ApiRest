package co.com.ias.apirest.repository;

import co.com.ias.apirest.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepository extends CrudRepository<Student, Integer> {
}
