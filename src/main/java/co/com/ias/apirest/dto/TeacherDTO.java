package co.com.ias.apirest.dto;

import co.com.ias.apirest.entity.Subject;
import co.com.ias.apirest.entity.Teacher;

import java.util.List;
import java.util.Optional;

public class TeacherDTO {
    private Integer id;
    private String name;
    private String lastName;
    private Integer age;
    private List<Subject> subjects;

    public TeacherDTO(Optional<Teacher> byId) {
    }

    public TeacherDTO(Integer id, String name, String lastName, Integer age, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.subjects = subjects;
    }

    public TeacherDTO(Teacher teacher){
        this.id = teacher.getId();
        this.name = teacher.getName();
        this.lastName = teacher.getLastName();
        this.age = teacher.getAge();
        this.subjects = teacher.getSubjects();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
