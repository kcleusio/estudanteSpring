package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.FEBRUARY;
import static java.util.Calendar.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student dayana = new Student(
                    "Dayana",
                    "dayana@4mais.ao",
                    LocalDate.of(2022, MARCH, 15)

            );

            Student damir = new Student(
                    "Damir",
                    "damir@4mais.ao",
                    LocalDate.of(2022, FEBRUARY, 7)
            );

            Student ethan = new Student(
                    "ethan",
                    "ethan@4mais.ao",
                    LocalDate.of(2022, FEBRUARY, 7)
            );
            studentRepository.saveAll(
                    List.of(damir, ethan, dayana)
            );
        };
    }
}
