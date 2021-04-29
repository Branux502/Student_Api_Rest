package com.demo.student.StudentUnderTest;

import com.demo.student.Student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@DataJpaTest
public class StudentRepositoryTest {
/*
    @Autowired
    private final StudentRepository underTest;

    public StudentRepositoryTest(StudentRepository underTest) {
        this.underTest = underTest;
    }
  */

    @Test(enabled = false)
    public void testFindStudentByEmail() {

        System.out.println("hello world");
        String emailTest = "juanito@gmail.com";
        try{
            System.out.println();
           // underTest.findStudentByEmail(emailTest);
        }catch(Exception e){
            System.out.println("it does not work");
        }

    }
}