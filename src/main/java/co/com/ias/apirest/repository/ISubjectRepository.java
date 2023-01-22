package co.com.ias.apirest.repository;

import co.com.ias.apirest.dto.StudentDTO;
import co.com.ias.apirest.entity.Subject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ISubjectRepository extends CrudRepository<Subject, Integer> {


}
