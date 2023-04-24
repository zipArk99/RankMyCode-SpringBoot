package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Student;
import com.Package.RankMyCode.Collections.StudentCredentials;

import java.util.List;
import java.util.Optional;

//this is student service interface
public interface StudentServiceInterface {
    public String addStudent(Student student);

    public Optional<Student> getStudentById (String id);

    List<Student> getStudentByBatchName(List<String> batchList);

    public Student getStudentByUsernameAndPassword(StudentCredentials studentCredentials);
}
