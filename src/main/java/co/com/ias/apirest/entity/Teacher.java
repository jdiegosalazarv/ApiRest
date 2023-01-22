package co.com.ias.apirest.entity;

import co.com.ias.apirest.dto.TeacherDTO;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class Teacher {

    @Id
    private Integer id;

    private String name;

    private String lastName;
    private Integer personalId;
    private Integer age;
    @JsonManagedReference
    @OneToMany(mappedBy = "teacher")
    private List<Subject> subjects;

    public Teacher() {
    }

    public Teacher(Integer id) {
        this.id = id;
    }

    public Teacher(Integer id, String name, String lastName, Integer personalId, Integer age, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.personalId = personalId;
        this.age = age;
        this.subjects = subjects;
    }

    public Teacher(TeacherDTO teacherDTO){
        this.id = teacherDTO.getId();
        this.name = teacherDTO.getName();
        this.lastName = teacherDTO.getLastName();
        this.personalId = teacherDTO.getPersonalId();
        this.age = teacherDTO.getAge();
        this.subjects = teacherDTO.getSubjects();
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

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
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

    public void setSubject(List<Subject> subjects) {
        this.subjects = subjects;
    }
}

