package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Contest;
import com.Package.RankMyCode.Collections.Faculty;
import com.Package.RankMyCode.Collections.FacultyCredentials;

import java.util.List;

public interface FacultyServiceInterface {
    public Faculty addFaculty(Faculty faculty);
    public List<Faculty> getFacultyList();

    public Faculty getFaculty(FacultyCredentials facultyCredentials);
    public void addContestToContestCreatedList(String facultyId,String contestId);


}
