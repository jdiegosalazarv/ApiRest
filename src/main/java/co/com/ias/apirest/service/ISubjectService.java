package co.com.ias.apirest.service;

import co.com.ias.apirest.dto.SubjectDTO;

import java.util.List;

public interface ISubjectService {

    void saveSubject(SubjectDTO subjectDTO);

    List<SubjectDTO> getSubjects();

    SubjectDTO findSubjectById(SubjectDTO subjectDTO);

    void updateSubject(SubjectDTO subjectDTO);

    void deleteSubject(SubjectDTO subjectDTO);
}
