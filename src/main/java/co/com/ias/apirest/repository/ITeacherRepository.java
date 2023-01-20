package co.com.ias.apirest.repository;

import co.com.ias.apirest.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface ITeacherRepository extends CrudRepository<Teacher, Integer> {
}
