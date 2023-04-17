package com.Package.RankMyCode.Collections;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {
    @Id
    private String userName;
    private StudentCredentials stdCred;
    private StudentInformation stdInfo;

    private String batchNumber;



    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Student(String userName, StudentCredentials stdCred, StudentInformation stdInfo, String batchNumber) {
        this.userName = userName;
        this.stdCred = stdCred;
        this.stdInfo = stdInfo;
        this.batchNumber = batchNumber;
    }

    public String getUserName() {
        return userName;
    }



    public void setUserName(String userName) {
        this.userName = userName;
    }

    public StudentCredentials getStdCred() {
        return stdCred;
    }

    public void setStdCred(StudentCredentials stdCred) {
        this.stdCred = stdCred;
    }

    public StudentInformation getStdInfo() {
        return stdInfo;
    }

    public void setStdInfo(StudentInformation stdInfo) {
        this.stdInfo = stdInfo;
    }


}
