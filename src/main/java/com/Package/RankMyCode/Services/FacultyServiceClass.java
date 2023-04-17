package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Contest;
import com.Package.RankMyCode.Collections.Faculty;
import com.Package.RankMyCode.Repositary.ContestRepositary;
import com.Package.RankMyCode.Repositary.FacultyRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceClass implements FacultyServiceInterface{

    @Autowired
    private   FacultyRepositary facultyRepositary;
    @Autowired
    private ContestRepositary contestRepositary;
    @Override
    public Faculty addFaculty(Faculty faculty) {
    return  facultyRepositary.save(faculty);
    }

  @Override
  public List<Faculty> getFacultyList() {
    return facultyRepositary.findAll();
  }

  @Override
  public Contest createContest(Contest contest) {
    Contest c =contestRepositary.save(contest);
    System.out.println(facultyRepositary.findById(c.getContestCreatedBy()));
    return c;

  }
}
