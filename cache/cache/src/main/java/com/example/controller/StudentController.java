package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Student;
import com.example.service.StudentService;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController
{


    @Autowired
    StudentService studentService;

  /*  @GetMapping("/student")
    public List<Student> getAllStudents(){
        return Arrays.asList(
                new Student(1,"Vishal","jnu"),
                new Student(2,"navneet","jamiya"),
                new Student(3,"mayuri","DU"),
                new Student(4,"sujaya","SRM"),
                new Student(5,"kush","VIT")
        );
}*/


    @GetMapping("/student/{id}")
    public Object findStudentById(@PathVariable int id)
    {
        System.out.println("Searching by ID  : " + id);

        return studentService.getStudentByID(id);
    }
}