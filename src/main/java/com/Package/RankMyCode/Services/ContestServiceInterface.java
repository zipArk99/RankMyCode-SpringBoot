package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Batch;
import com.Package.RankMyCode.Collections.Contest;

import java.util.List;

public interface ContestServiceInterface {
    public Contest createContest(Contest contest);

    public List<Contest> getListOfContest(Batch batch);
}
