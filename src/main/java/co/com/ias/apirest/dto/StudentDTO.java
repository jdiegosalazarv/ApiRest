package co.com.ias.apirest.dto;

import co.com.ias.apirest.entity.Student;
import co.com.ias.apirest.entity.Subject;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Optional;

public class StudentDTO {

    @NotNull
    @Pattern(regexp = "[0-9]+")
    private Integer id;
    @NotBlank(message = "Solo se admiten letras")
    @Pattern(regexp = "[a-zA-Z\\s]+")
    private String name;
    @NotBlank(message = "Solo se admiten letras")
    @Pattern(regexp = "[a-zA-Z\\s]+")
    private String lastName;
//    @DateTimeFormat(pattern = "yyyy-MM-dd", message="El formato de fecha debe ser YYYY-MM-DD")
    @Pattern(regexp = "^(19|20)\\d\\d[-](0[1-9]|1[012])[-](0[1-9]|[12][0-9]|3[01])$", message = "El formato de fecha debe ser YYYY-MM-DD")
    private LocalDate birthDay;
    @NotNull
    @Pattern(regexp = "[0-9]+")
    private Integer personalId;
    private Integer age;
    private Subject subject;

    public StudentDTO() {
    }

    public StudentDTO(Integer id) {
        this.id = id;
    }

    public StudentDTO(Integer id, String name, String lastName, String birthDay, Integer personalId, Integer age, Subject subject) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDay = LocalDate.parse(birthDay);
        this.personalId = personalId;
        this.age = age;
        this.subject = subject;
    }

    public StudentDTO(Student student){
        this.id = student.getId();
        this.name = student.getName();
        this.lastName = student.getLastName();
        this.birthDay = student.getBirthDay();
        this.personalId = student.getPersonalId();
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

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
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
