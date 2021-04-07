package com.demo.student.teacher;


import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepository repository;

    @Autowired
    public TeacherService(TeacherRepository repository) {
        this.repository = repository;
    }

    public void addNewTeacher(Teacher teacher){

        Optional<Teacher> studentByCui = repository.findTeacherByCui(teacher.getCui());
        Optional<Teacher> studentByEmail = repository.findTeacherByEmail(teacher.getEmail());

        if(studentByCui.isPresent() || studentByEmail.isPresent()){
            throw new IllegalStateException("The email or cui already exist, please enter valid info");
        }else{
            repository.save(teacher);
        }

    }

    public List<Teacher> getTeacher(){
        return repository.findAll();
    }

    public void deleteTeacher(Long teacherId){
        if(repository.existsById(teacherId)){
            repository.deleteById(teacherId);
        }else{
            throw new IllegalStateException("Teacher with id: " + teacherId + " does not exist");
        }
    }

    @Transactional
    public void updateTeacher(Long teacherId,Long cui,String name,String email){
        Teacher teacher = repository.findById(teacherId).orElseThrow( ()-> new IllegalStateException("Teacher with id: " + teacherId + " does not exist\nPlease check the Id one more time" ) );

        if(cui != null &&  String.valueOf(cui).length()==13 && !Objects.equals(teacher.getCui(),cui)){
            Optional<Teacher> studentByCui = repository.findTeacherByCui(cui);
            if(studentByCui.isPresent()){
                throw new IllegalStateException("CUI already exists");
            }
            teacher.setCui(cui);
        }

        if(email !=null && email.length()>0 && !Objects.equals(teacher.getEmail(),email)){
            Optional<Teacher> studentByEmail = repository.findTeacherByEmail(email);
            if(studentByEmail.isPresent()){
                throw new IllegalStateException("Email already exists");
            }
            teacher.setEmail(email);
        }

        if(name != null && name.length()>0 && !Objects.equals(teacher.getName(),name)){
            teacher.setName(name);
        }


    }

}
