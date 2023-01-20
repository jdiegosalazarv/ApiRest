package co.com.ias.apirest.dto;

import co.com.ias.apirest.entity.Student;
import co.com.ias.apirest.entity.Subject;
import co.com.ias.apirest.entity.Teacher;


import java.util.List;
import java.util.Optional;

public class SubjectDTO {
    private Integer id;
    private List<Student> students;
    private Teacher teacher;
    private String schedule;
    private String topic;

    public SubjectDTO() {
    }

    public SubjectDTO(Integer id, List<Student> students, Teacher teacher, String schedule, String topic) {
        this.id = id;
        this.students = students;
        this.teacher = teacher;
        this.schedule = schedule;
        this.topic = topic;
    }

    public SubjectDTO(Subject subject){
        this.id = subject.getId();
        this.students = subject.getStudents();
        this.teacher = subject.getTeacher();
        this.schedule = subject.getSchedule();
        this.topic = subject.getTopic();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
