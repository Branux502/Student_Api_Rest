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
    CommandLineRunner commandLineRunnerStudent(StudentRepository repository){
        return args -> {
            Student maria = new Student(
                    "Maria ",
                    "maria@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,25)

            );
            Student pedro = new Student(
                    "Pedro",
                    "pedro@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,25)
            );
            Student juan = new Student(
                    "juan",
                    "juan@gmail.com",
                    LocalDate.of(2004, Month.JANUARY,25)
            );
            repository.saveAll(List.of(maria,pedro,juan));
        };
    }
}
