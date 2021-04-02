package com.demo.student.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long > {

    //this will be convert to a sql such as (SELECT * FROM  student where email = ?)
    //@Query("SELECT s FROM Student s WHERE s.email = ?1")
    //Optional<Student> findStudentbyEmail(String email);
    Optional<Student> findStudentByEmail(String email);

}
