package com.example.microservices.service;

import com.example.microservices.dto.StudentDTORequest;
import com.example.microservices.dto.StudentDTOResponse;
import com.example.microservices.model.Student;
import com.example.microservices.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public StudentDTOResponse addStudent(StudentDTORequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setEmail(request.getEmail());
        repository.save(student);
        StudentDTOResponse studentDTOResponse = new StudentDTOResponse();
        studentDTOResponse.setId(student.getId());
        studentDTOResponse.setEmail(student.getEmail());
        studentDTOResponse.setName(student.getName());
        return studentDTOResponse;
    }
}
