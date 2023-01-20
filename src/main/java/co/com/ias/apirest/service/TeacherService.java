package co.com.ias.apirest.service;

import co.com.ias.apirest.dto.StudentDTO;
import co.com.ias.apirest.dto.TeacherDTO;
import co.com.ias.apirest.entity.Student;
import co.com.ias.apirest.entity.Teacher;
import co.com.ias.apirest.repository.ITeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
        Optional<Teacher> teacher = this.iTeacherRepository.findById(teacherDTO.getId());
        return teacher.map(TeacherDTO::new).orElse(null);
    }

    @Override
    public void updateTeacher(TeacherDTO teacherDTO) {
        if(this.iTeacherRepository.existsById(teacherDTO.getId())){
            this.iTeacherRepository.save(new Teacher(teacherDTO));
        }
    }

    @Override
    public void deleteTeacher(Integer teacherId) {
        if(this.iTeacherRepository.existsById(teacherId)){
            this.iTeacherRepository.deleteById(teacherId);
        }
    }
}
