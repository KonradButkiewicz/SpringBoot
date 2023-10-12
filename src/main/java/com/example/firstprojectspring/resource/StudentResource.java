package com.example.firstprojectspring.resource;

import com.example.firstprojectspring.Data.Student;
import com.example.firstprojectspring.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/FirstProjectSpring")
@RequiredArgsConstructor
public class StudentResource {
    private final StudentService studentService;

    @PostMapping
    public void createStudent(Student student){
        studentService.createStudent(student);
    }
}
