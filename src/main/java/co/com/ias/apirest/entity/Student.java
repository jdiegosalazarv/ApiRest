package co.com.ias.apirest.entity;

import co.com.ias.apirest.dto.StudentDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Student {

    @Id
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private LocalDate birthDay;
    @Column(nullable = false)
    private Integer personalId;
    @Column(nullable = false)
    private Integer age;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "subject_id")
//    @Column(nullable = false)
    private Subject subject;

    public Student() {
    }

    public Student(Integer id) {
        this.id = id;
    }

    public Student(Integer id, String name, String lastName, LocalDate birthDay, Integer personalId, Integer age, Subject subject) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.personalId = personalId;
        this.age = age;
        this.subject = subject;
    }

    public Student(StudentDTO studentDTO){
        this.id = studentDTO.getId();
        this.name = studentDTO.getName();
        this.lastName = studentDTO.getLastName();
        this.birthDay = studentDTO.getBirthDay();
        this.personalId = studentDTO.getPersonalId();
        this.age = studentDTO.getAge();
        this.subject = studentDTO.getSubject();
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

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
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
