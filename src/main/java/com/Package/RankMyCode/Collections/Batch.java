package com.Package.RankMyCode.Collections;

import java.util.List;

public class Batch {
    private String batchId;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public Batch(String batchId, List<String> contestEnrolledList) {
        this.batchId = batchId;
        this.contestEnrolledList = contestEnrolledList;
    }

    public List<String> getContestEnrolledList() {
        return contestEnrolledList;
    }

    public void setContestEnrolledList(List<String> contestEnrolledList) {
        this.contestEnrolledList = contestEnrolledList;
    }

    private List<String> contestEnrolledList;


}
