package com.Package.RankMyCode.Collections;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "batch")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Batch {
    @Id
    private String batchId;
    @Field
    private List<String> contestEnrolledList;

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



}
