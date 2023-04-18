package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Student;

import java.util.List;
import java.util.Optional;

public interface StudentServiceInterface {
    public String addStudent(Student student);

    public Optional<Student> getStudentById (String id);

    List<Student> getStudentByBatchName(List<String> batchList);
}
