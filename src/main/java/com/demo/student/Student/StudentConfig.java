package com.demo.student.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
         Student maria = new Student(
                 "Maria ",
                 "mariapita@gmail.com",
                 LocalDate.of(2000, Month.JANUARY,25)

         );
            Student pepito = new Student(
                    "Pita",
                    "pita@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,25)
            );
            repository.saveAll(List.of(maria,pepito));
        };
    }
}
