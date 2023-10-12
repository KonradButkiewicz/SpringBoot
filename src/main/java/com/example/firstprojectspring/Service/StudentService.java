package com.example.firstprojectspring.Service;

import com.example.firstprojectspring.Data.Student;
import com.example.firstprojectspring.Data.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public void createStudent(Student student) {
        StudentService.createstudent

        }
    }
}
