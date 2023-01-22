package co.com.ias.apirest.dto;

import co.com.ias.apirest.entity.Subject;
import co.com.ias.apirest.entity.Teacher;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Optional;

public class TeacherDTO {

    private Integer id;
    @NotBlank(message = "No puede estar vacío")
    @Pattern(regexp = "[a-zA-Z\\s]+", message = "Solo se admiten letras")
    private String name;
    @NotBlank(message = "No puede estar vacío")
    @Pattern(regexp = "[a-zA-Z\\s]+", message = "Solo se admiten letras")
    private String lastName;
    private Integer personalId;
    @Digits(integer = 3,fraction = 0, message = "Solo puedes ingresar números")
    private Integer age;
    private List<Subject> subjects;

    public TeacherDTO() {
    }

    public TeacherDTO(Integer id) {
        this.id = id;
    }

    public TeacherDTO(Integer id, String name, String lastName, Integer personalId, Integer age, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.personalId = personalId;
        this.age = age;
        this.subjects = subjects;
    }

    public TeacherDTO(Teacher teacher){
        this.id = teacher.getId();
        this.name = teacher.getName();
        this.lastName = teacher.getLastName();
        this.personalId = teacher.getPersonalId();
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

}
