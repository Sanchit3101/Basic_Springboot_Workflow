package com.sanchitcodes.restapi.SpringBootRestAPIProject.controller;

import com.sanchitcodes.restapi.SpringBootRestAPIProject.entity.Student;
import com.sanchitcodes.restapi.SpringBootRestAPIProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    // get all the Students
    @Autowired
    StudentRepository repo;

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        List<Student> students= repo.findAll();
        return students;
    }

    // get student details basis of id
    // localhost:8080/students/1(id)
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        Student student = repo.findById(id).get();
        return student;
    }

    // To Create a New Student
    @PostMapping("/students/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student){
        repo.save(student);

    }
    @PutMapping("/students/update/{id}")
    public  Student updateStudent(@PathVariable int id){
        Student student  = repo.findById(id).get();
        student.setName("Rachit");
        student.setPercentage(92);
        repo.save(student);
        return student;

    }
    @DeleteMapping("/students/delete/{id}")
    public void removeStudent(@PathVariable int id){
        Student student  = repo.findById(id).get();
        repo.delete(student);

    }


}
