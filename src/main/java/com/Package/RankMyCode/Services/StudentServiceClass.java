package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Student;
import com.Package.RankMyCode.Repositary.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class StudentServiceClass implements  StudentServiceInterface{


    @Autowired
    private StudentRepositary studentRepositary;
    @Override
    public String addStudent(Student student)
    {
        try {
            return studentRepositary.save(student).getUserName();
        }catch (Exception exception){
            return "error occured ::"+exception;
        }

    }

    @Override
    public Optional<Student> getStudentById(String id) {
        return studentRepositary.findById(id);


    }
}
