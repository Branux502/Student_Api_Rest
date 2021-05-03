package com.demo.student.IntegrationTest;

import com.demo.student.Student.Student;
import com.demo.student.Student.StudentController;
import com.demo.student.Student.StudentRepository;
import com.demo.student.Student.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Optional;
/*
@SpringBootConfiguration(class)
@AutoConfigureMockMvc
@WebMvcTest(StudentController.class)*/
public class GetMethods {
/*
    @Autowired
    private MockMvc mvc;

    @MockBean
    private StudentService underTestService;

    @Autowired
    private StudentRepository underTestRepository;



    @Test
    public void getStudent (){
        List<Student> studentList = underTestService.getStudent();
        System.out.println(studentList);
    }

*/
}
