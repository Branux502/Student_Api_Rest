package com.demo.student.teacher;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;


@Entity
@Table(name = "tb_teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cui;
    private String name;
    private String email;
    private LocalDate dob;
    @Transient
    private int age;

    public Teacher() {
    }

    public Teacher(Long id, Long cui, String name, String email, LocalDate dob, int age) {
        this.id = id;
        this.cui = cui;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Teacher(Long CUI, String name, String email, LocalDate dob) {
        this.cui = CUI;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCui() {
        return cui;
    }

    public void setCui(Long cui) {
        this.cui = cui;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return Period.between(this.dob,LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }
}
