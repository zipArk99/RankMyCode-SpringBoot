package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Student;
import com.Package.RankMyCode.Repositary.StudentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    @Override
    public List<Student> getStudentByBatchName(List<String> batchList) {
        List<Student> studentsList= new ArrayList<>();
        for(String batch : batchList){
            studentsList.addAll(studentRepositary.findBybatchNumber(batch));
        }
        return studentsList;
    }
}
