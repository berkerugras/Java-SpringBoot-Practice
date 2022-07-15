package com.BerkerSpring.BerkerHelloWorld.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student") //bu adrese istek yapıldığında
public class StudentController {
    private final StudentService studentService;
    //the object will be automatically instaniated for us by using autowired.

    @Autowired
    public StudentController(StudentService stud) {
        this.studentService = stud;
    }

    @GetMapping //Eğer getse bu method döndürülür
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent( @RequestBody Student student) {
        studentService.addNewStudent(student);
    }

}
