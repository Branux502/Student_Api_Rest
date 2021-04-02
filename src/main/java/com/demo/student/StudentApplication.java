package com.demo.student;

import com.demo.student.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@SpringBootApplication
//@RestController
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	/*
	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Juan",
						"Juan@gmail.com",
						LocalDate.of(200,Month.JANUARY,5),
						21
				)
		);
	}

	 */

}
