package com.BerkerSpring.BerkerHelloWorld.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service // Same with component but it is for semantics
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        System.out.println("sdşlfi");
        return studentRepository.findAll();

    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail=studentRepository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
            System.out.println("email taken");
            System.out.println("kasşldkas");
            throw new IllegalStateException("email taken");
        }
        else{
            studentRepository.save(student);
        }
    }
}
