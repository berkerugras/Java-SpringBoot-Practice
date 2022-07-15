package com.BerkerSpring.BerkerHelloWorld.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private LocalDate dob;
    @Transient //is no longer column in our because of this annotation
    private Integer age;

    private String Email;
    public Student( ){

    }

    public Student(Long id,
                   String name,
                   LocalDate dob,
                   String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        Email = email;
    }

    public Student(String name,
                   LocalDate dob,
                   String email) {
        this.name = name;
        this.dob = dob;
        this.age = age;
        Email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", Email='" + Email + '\'' +
                '}';
    }
}
