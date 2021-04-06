package com.demo.student.teacher;


import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository repository;

    @Autowired
    public TeacherService(TeacherRepository repository) {
        this.repository = repository;
    }

    public void addNewTeacher(Teacher teacher){
        repository.save(teacher);
    }

    public List<Teacher> getTeacher(){
        return repository.findAll();
    }
}
