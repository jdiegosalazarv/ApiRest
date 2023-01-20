package co.com.ias.apirest.service;

import co.com.ias.apirest.dto.StudentDTO;
import co.com.ias.apirest.dto.TeacherDTO;

import java.util.List;

public interface ITeacherService {

    void saveTeacher(TeacherDTO teacherDTO);

    List<TeacherDTO> getTeachers();

    TeacherDTO findTeacherById(TeacherDTO teacherDTO);

    void updateTeacher(TeacherDTO teacherDTO);

    void deleteTeacher(TeacherDTO teacherDTO);
}
