package com.Package.RankMyCode.Controllers;

import com.Package.RankMyCode.Collections.Contest;
import com.Package.RankMyCode.Collections.Student;
import com.Package.RankMyCode.Collections.StudentCredentials;
import com.Package.RankMyCode.Services.StudentServiceInterface;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("student")
public class StudentController {

    private static final String JWT_SECRET = "THIS IS A SECRET KEY FOR RANK MY CODE JWT";
    @Autowired
    private StudentServiceInterface studentServiceObject;
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

    @PostMapping("/login")
    public ResponseEntity<?> getStudentByUsername(@RequestBody StudentCredentials studentCredentials) {
        JSONObject jsonObject = new JSONObject();
        Student student = studentServiceObject.getStudentByUsernameAndPassword(studentCredentials);
        jsonObject.put("Success",false);
        if(student == null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//            return ResponseEntity.of(Optional.of(jsonObject));
        }
        return ResponseEntity.of(Optional.of(student));
    }

    @PostMapping(value = "/batches",consumes ="application/json")
    public ResponseEntity<List<Student>> getStudentsByBatchName(@RequestBody Contest contest){

        List<Student> s= studentServiceObject.getStudentByBatchName(contest.getBatchEnrolled());
        return ResponseEntity.of(Optional.of(s));
    }


    }



