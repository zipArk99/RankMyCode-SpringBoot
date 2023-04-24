package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Batch;
import com.Package.RankMyCode.Collections.Contest;
import com.Package.RankMyCode.Collections.Faculty;
import com.Package.RankMyCode.Collections.FacultyCredentials;
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

    @Override
    public Faculty addFaculty(Faculty faculty) {
    return  facultyRepositary.save(faculty);
    }

  @Override
  public List<Faculty> getFacultyList() {
    return facultyRepositary.findAll();
  }

    @Override
    public Faculty getFaculty(FacultyCredentials facultyCredentials) {
        return facultyRepositary.findByFacultyEmailIdAndPassword(facultyCredentials.getEmailId(),facultyCredentials.getPassword());

    }

    @Override
    public void addContestToContestCreatedList(String facultyId, String contestId) {
        Faculty f=facultyRepositary.findById(facultyId).orElse(null);
        assert f != null;
        List<String> contestCreatedList = new ArrayList<>(f.getContestCreated());
        contestCreatedList.add(contestId);
        f.setContestCreated(contestCreatedList);
        facultyRepositary.save(f);

    }


}
