package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Batch;
import com.Package.RankMyCode.Collections.Contest;
import com.Package.RankMyCode.Repositary.BatchRepositary;
import com.Package.RankMyCode.Repositary.ContestRepositary;
import com.Package.RankMyCode.Repositary.FacultyRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContestServiceClass implements  ContestServiceInterface{

    @Autowired
    private ContestRepositary contestRepositary;
    @Autowired
    private BatchRepositary batchRepositary;

    @Autowired
    private FacultyServiceInterface facultyServiceObject;
    @Override
    public Contest createContest(Contest contest) {
        //inserting contest document
        Contest con =contestRepositary.save(contest);
        String contestId=con.getContestId();

        //adding contest to contest created List
        facultyServiceObject.addContestToContestCreatedList(con.getContestCreatedBy(),contestId);


        //adding contest to batch collection
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

    @Override
    public List<Contest> getListOfContest(Batch batch) {
        List<String> contestId = batch.getContestEnrolledList();
        List<Contest> contestList = new ArrayList<>();
        for (String cId : contestId) {
            contestList.add(contestRepositary.findById(cId).orElse(null));
        }
        return contestList;
    }
}
