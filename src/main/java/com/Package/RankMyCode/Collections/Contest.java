package com.Package.RankMyCode.Collections;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "contest")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contest {

    @Id
    private String contestId;

    private String contestName;
    private String contestCreatedBy;
    private String contestInformation;
    private List<String> batchEnrolled;

    public String getContestId() {
        return contestId;
    }

    public Contest(String contestId, String contestName, String contestCreatedBy, String contestInformation, List<String> batchEnrolled) {
        this.contestId = contestId;
        this.contestName = contestName;
        this.contestCreatedBy = contestCreatedBy;
        this.contestInformation = contestInformation;
        this.batchEnrolled = batchEnrolled;
    }

    public void setContestId(String contestId) {
        this.contestId = contestId;
    }

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public String getContestCreatedBy() {
        return contestCreatedBy;
    }

    public void setContestCreatedBy(String contestCreatedBy) {
        this.contestCreatedBy = contestCreatedBy;
    }

    public String getContestInformation() {
        return contestInformation;
    }

    public void setContestInformation(String contestInformation) {
        this.contestInformation = contestInformation;
    }

    public List<String> getBatchEnrolled() {
        return batchEnrolled;
    }

    public void setBatchEnrolled(List<String> batchEnrolled) {
        this.batchEnrolled = batchEnrolled;
    }


}
