package com.Package.RankMyCode.Controllers;

import com.Package.RankMyCode.Collections.Contest;
import com.Package.RankMyCode.Collections.Faculty;
import com.Package.RankMyCode.Collections.FacultyCredentials;
import com.Package.RankMyCode.Services.ContestServiceInterface;
import com.Package.RankMyCode.Services.FacultyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin("localhost:")
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    private FacultyServiceInterface facultyServiceObject;
    @Autowired
    private ContestServiceInterface contestServiceObject;

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<Faculty> addFaculty(@RequestBody Faculty faculty) {
        Faculty f = facultyServiceObject.addFaculty(faculty);
        return ResponseEntity.of(Optional.of(f));

    }

    @GetMapping("/faculties")
    public ResponseEntity<List<Faculty>> getFaculties() {
        List<Faculty> fL = facultyServiceObject.getFacultyList();
        if (fL.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(fL));

    }

    @PostMapping(value = "/contest",consumes ="application/json")
    public ResponseEntity<Contest> createContest(@RequestBody Contest contest){
        Contest c=contestServiceObject.createContest(contest);
        return ResponseEntity.of(Optional.of(c));



    }

    @PostMapping(value = "/getFaculty",consumes ="application/json" )
    public ResponseEntity<Faculty> getFaculty(@RequestBody FacultyCredentials facultyCredentials){
    Faculty faculty= facultyServiceObject.getFaculty(facultyCredentials);
    if(faculty==null){
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    return ResponseEntity.of(Optional.of(faculty));
    }
}
