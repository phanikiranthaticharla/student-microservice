package com.example.microservices.controller;

import com.example.microservices.dto.StudentDTORequest;
import com.example.microservices.dto.StudentDTOResponse;
import com.example.microservices.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/add")
    public StudentDTOResponse addStudent(@RequestBody StudentDTORequest request) {
        return studentService.addStudent(request);
    }
}
