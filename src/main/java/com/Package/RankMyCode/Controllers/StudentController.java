package com.Package.RankMyCode.Controllers;

import com.Package.RankMyCode.Collections.Student;
import com.Package.RankMyCode.Services.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentServiceInterface studentServiceObject;
    @PostMapping(value = "/add",consumes = "application/json")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        String std= studentServiceObject.addStudent(student);
        if(std.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(std));

    }

    @GetMapping("/getStudentById/{id}")
    public ResponseEntity<Optional<Student>> getStudentsById(@PathVariable String id){
        Optional<Student> s=  studentServiceObject.getStudentById(id);
        return ResponseEntity.of(Optional.of(s));
    }





}
