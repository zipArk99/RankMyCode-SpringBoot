package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Batch;
import com.Package.RankMyCode.Collections.Contest;
import com.Package.RankMyCode.Collections.Faculty;
import com.Package.RankMyCode.Repositary.BatchRepositary;
import com.Package.RankMyCode.Repositary.ContestRepositary;
import com.Package.RankMyCode.Repositary.FacultyRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyServiceClass implements FacultyServiceInterface{

    @Autowired
    private   FacultyRepositary facultyRepositary;
    @Autowired
    private BatchRepositary batchRepositary;
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
    Contest con =contestRepositary.save(contest);
    String contestId=con.getContestId();
    List<String> tempStr=new ArrayList<>();
    for(String batchName : con.getBatchEnrolled()){
        tempStr.clear();
        if(batchRepositary.existsById(batchName)){


            Batch b= batchRepositary.findById(batchName).orElse(null);
            assert b != null;
            if(b.getContestEnrolledList().size()>0) {
                tempStr.addAll(b.getContestEnrolledList());
            }
            tempStr.add(contestId);
            batchRepositary.save(new Batch(batchName,tempStr));
            
        }else{
            tempStr.add(contestId);
            batchRepositary.save(new Batch(batchName,tempStr));


        }
    }
    return con;

  }
}
