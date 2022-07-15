package com.BerkerSpring.BerkerHelloWorld.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args->{
                  Student Berker=  new Student(
                            1L,
                            "Berker",
                            LocalDate.of(2000,5,31),
                            "berkerugras@gmail.com"
                    ); //we've have converted java object to a JSON

            Student Kerim=  new Student(
                    "Kerim",
                    LocalDate.of(1820,5,31),
                    "kerim123@gmail.com"
            ); //we've have converted java object to a JSON
            repository.saveAll(
                    List.of(Berker,Kerim)
            );
        };


    }
}
