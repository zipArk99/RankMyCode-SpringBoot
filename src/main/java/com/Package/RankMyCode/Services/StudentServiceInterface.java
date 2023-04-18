package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Student;

import java.util.Optional;

public interface StudentServiceInterface {
    public String addStudent(Student student);

    public Optional<Student> getStudentById (String id);
    }
