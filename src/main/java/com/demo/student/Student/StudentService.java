package com.demo.student.Student;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {


    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }



    public List<Student> getStudent(){
        return repository.findAll();
    }

    public void addNewStudent(Student student) {

        //Optional<Student> studentByEmail=  repository.findStudentbyEmail(student.getEmail()).isPresent(repository.save(student));
       Optional<Student> studentByEmail=  repository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("Email taken");
        }else{
            repository.save(student);
        }
        System.out.println(student);
    }


    public void deleteStudent(Long studentId) {

        //boolean b = repository.existsById(studentId);
        if(repository.existsById(studentId)){
            repository.deleteById(studentId);
        }else{
            throw new IllegalStateException("student with id " + studentId + " does not exist");
        }



    }
    @Transactional
    public void updateStudent(Long studentId, String name, String email) {

        Student student = repository.findById(studentId).orElseThrow( () -> new IllegalStateException("student with id " + studentId + " does not exist") );

        if(name != null && name.length() > 0 && !Objects.equals(student.getName(),name)){
            student.setName(name);
        }

        if(email != null && email.length() > 0 && !Objects.equals(student.getEmail(),email)){

            Optional<Student> studentByEmail=  repository.findStudentByEmail(email);
            if(studentByEmail.isPresent()){
                throw new IllegalStateException("email taken");
            }
                student.setEmail(email);




        }
    }
}
