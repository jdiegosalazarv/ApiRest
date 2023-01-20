package co.com.ias.apirest.dto;

import co.com.ias.apirest.entity.Student;
import co.com.ias.apirest.entity.Subject;

import java.util.Date;
import java.util.Optional;

public class StudentDTO {


    private Integer id;
    private String name;
    private String lastName;
    private Date birthDay;
    private Integer age;
    private Subject subject;

    public StudentDTO(Optional<Student> byId) {
    }

    public StudentDTO(Integer id, String name, String lastName, Date birthDay, Subject subject) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.subject = subject;
    }

    public StudentDTO(Student student){
        this.id = student.getId();
        this.name = student.getName();
        this.lastName = student.getLastName();
        this.birthDay = student.getBirthDay();
        this.subject = student.getSubject();
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

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getAge() {
        return age;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
