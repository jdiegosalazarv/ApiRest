package co.com.ias.apirest.repository;

import co.com.ias.apirest.entity.Subject;
import org.springframework.data.repository.CrudRepository;

public interface ISubjectRepository extends CrudRepository<Subject, Integer> {
}
