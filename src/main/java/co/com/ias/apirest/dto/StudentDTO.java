package co.com.ias.apirest.dto;

import co.com.ias.apirest.entity.Student;
import co.com.ias.apirest.entity.Subject;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Optional;

public class StudentDTO {


    private Integer id;
    private String name;
    private String lastName;
    private LocalDate birthDay;
    private Integer age;
    private Subject subject;

    public StudentDTO() {
    }

    public StudentDTO(Integer id) {
        this.id = id;
    }

    public StudentDTO(Integer id, String name, String lastName, String birthDay, Integer age, Subject subject) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDay = LocalDate.parse(birthDay);
        this.age = age;
        this.subject = subject;
    }

    public StudentDTO(Student student){
        this.id = student.getId();
        this.name = student.getName();
        this.lastName = student.getLastName();
        this.birthDay = student.getBirthDay();
        this.age = student.getAge();
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

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void setAge(Integer age){
        this.age = age;
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
