package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Contest;
import com.Package.RankMyCode.Collections.Faculty;

import java.util.List;

public interface FacultyServiceInterface {
    public Faculty addFaculty(Faculty faculty);
    public List<Faculty> getFacultyList();

    public Contest createContest(Contest contest);
}
