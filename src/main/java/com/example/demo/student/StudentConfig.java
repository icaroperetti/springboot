package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student test = new Student(
                    "test",
                    20,
                    LocalDate.of(2001, AUGUST,20),
                    "teste@gmail.com"
            );

            Student icaro = new Student(
                    "icaro",
                    20,
                    LocalDate.of(2004, AUGUST,20),
                    "icaro@gmail.com"
            );

            repository.saveAll(
                    List.of(test,icaro)
            );
        };
    }

}
