package co.com.ias.apirest.service;

import co.com.ias.apirest.dto.StudentDTO;
import co.com.ias.apirest.dto.TeacherDTO;
import co.com.ias.apirest.entity.Student;
import co.com.ias.apirest.entity.Teacher;
import co.com.ias.apirest.repository.ITeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherService implements ITeacherService{

    private final ITeacherRepository iTeacherRepository;

    public TeacherService(ITeacherRepository iTeacherRepository) {
        this.iTeacherRepository = iTeacherRepository;
    }

    @Override
    public void saveTeacher(TeacherDTO teacherDTO) {
        if(!this.iTeacherRepository.existsById(teacherDTO.getId())){
            this.iTeacherRepository.save(new Teacher(teacherDTO));
        }
    }

    @Override
    public List<TeacherDTO> getTeachers() {
        List<Teacher> list = (List<Teacher>) this.iTeacherRepository.findAll();
        return list.stream().map(TeacherDTO::new).collect(Collectors.toList());
    }

    @Override
    public TeacherDTO findTeacherById(TeacherDTO teacherDTO) {
        return new TeacherDTO(this.iTeacherRepository.findById(teacherDTO.getId()));
    }

    @Override
    public void updateTeacher(TeacherDTO teacherDTO) {
        if(this.iTeacherRepository.existsById(teacherDTO.getId())){
            this.iTeacherRepository.save(new Teacher(teacherDTO));
        }
    }

    @Override
    public void deleteTeacher(TeacherDTO teacherDTO) {
        if(this.iTeacherRepository.existsById(teacherDTO.getId())){
            this.iTeacherRepository.deleteById(teacherDTO.getId());
        }
    }
}
