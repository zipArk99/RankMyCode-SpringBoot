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

    public String getUserName() {
        return userName;
    }

    public Student(String userName, StudentCredentials stdCred, StudentInformation stdInfo) {
        this.userName = userName;
        this.stdCred = stdCred;
        this.stdInfo = stdInfo;
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
