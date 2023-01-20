package co.com.ias.apirest.service;

import co.com.ias.apirest.dto.StudentDTO;
import co.com.ias.apirest.dto.SubjectDTO;
import co.com.ias.apirest.entity.Student;
import co.com.ias.apirest.entity.Subject;
import co.com.ias.apirest.repository.ISubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubjectService implements ISubjectService{

    private final ISubjectRepository iSubjectRepository;

    public SubjectService(ISubjectRepository iSubjectRepository) {
        this.iSubjectRepository = iSubjectRepository;
    }

    @Override
    public void saveSubject(SubjectDTO subjectDTO) {
        if(!this.iSubjectRepository.existsById(subjectDTO.getId())){
            this.iSubjectRepository.save(new Subject(subjectDTO));
        }
    }

    @Override
    public List<SubjectDTO> getSubjects() {
        List<Subject> list = (List<Subject>) this.iSubjectRepository.findAll();
        return list.stream().map(SubjectDTO::new).collect(Collectors.toList());
    }

    @Override
    public SubjectDTO findSubjectById(SubjectDTO subjectDTO) {
        return new SubjectDTO(this.iSubjectRepository.findById(subjectDTO.getId()));
    }

    @Override
    public void updateSubject(SubjectDTO subjectDTO) {
        if(this.iSubjectRepository.existsById(subjectDTO.getId())){
            this.iSubjectRepository.save(new Subject(subjectDTO));
        }
    }

    @Override
    public void deleteSubject(SubjectDTO subjectDTO) {
        if(this.iSubjectRepository.existsById(subjectDTO.getId())){
            this.iSubjectRepository.deleteById(subjectDTO.getId());
        }
    }
}
