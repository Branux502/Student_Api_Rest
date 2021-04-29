package com.demo.student.teacher;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class TeacherConfig {

    @Bean
    CommandLineRunner commandLineRunnerTeacher(TeacherRepository repository){
        return args -> {
            Teacher alfredo = new Teacher(
                    3017141170101L,
                    "Alfredo",
                    "alfredo@gmail.com",
                    LocalDate.of(1998,Month.DECEMBER,15)
            );
            Teacher fredy = new Teacher(
                    1412514250101L,
                    "Fredy",
                    "fredy@gmail.com",
                    LocalDate.of(1995, Month.JULY,20)
            );
            Teacher flor = new Teacher(
                    1830195250101L,
                    "Flor",
                    "Flow@gmail.com",
                    LocalDate.of(1993, Month.MARCH,17)
            );
            repository.saveAll(List.of(alfredo,fredy,flor));
        };
    }

}
