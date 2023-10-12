package com.example.firstprojectspring.Data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {

    private final List<Student> students = new ArrayList<>();
}
