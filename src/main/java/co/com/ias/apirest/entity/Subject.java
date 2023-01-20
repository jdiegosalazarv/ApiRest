package co.com.ias.apirest.entity;

import co.com.ias.apirest.dto.SubjectDTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Subject {

    @Id
    private Integer id;

    @OneToMany
    private List<Student> students;

    @OneToOne
    private Teacher teacher;
    private String schedule;
    private String topic;

    public Subject() {
    }

    public Subject(Integer id, List<Student> students, Teacher teacher, String schedule, String topic) {
        this.id = id;
        this.students = students;
        this.teacher = teacher;
        this.schedule = schedule;
        this.topic = topic;
    }

    public Subject(SubjectDTO subjectDTO){
        this.id = subjectDTO.getId();
        this.students = subjectDTO.getStudents();
        this.teacher = subjectDTO.getTeacher();
        this.schedule = subjectDTO.getSchedule();
        this.topic = subjectDTO.getTopic();

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