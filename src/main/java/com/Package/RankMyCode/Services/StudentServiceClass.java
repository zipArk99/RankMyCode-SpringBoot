package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Student;
import com.Package.RankMyCode.Repositary.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceClass implements  StudentServiceInterface{


    @Autowired
    private StudentRepositary studentRepositary;
    @Override
    public String addStudent(Student student)
    {

        return  studentRepositary.save(student).getUserName();

    }
}
