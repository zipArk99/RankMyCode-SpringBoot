package com.Package.RankMyCode.Collections;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "faculty")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Faculty {

    @Id
    private String facultyId;

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyEmailId() {
        return facultyEmailId;
    }

    public void setFacultyEmailId(String facultyEmailId) {
        this.facultyEmailId = facultyEmailId;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyId='" + facultyId + '\'' +
                ", facultyEmailId='" + facultyEmailId + '\'' +
                ", password='" + password + '\'' +
                ", contestCreated=" + contestCreated +
                '}';
    }

    public Faculty(String facultyId, String facultyEmailId, String password, List<String> contestCreated) {
        this.facultyId = facultyId;
        this.facultyEmailId = facultyEmailId;
        this.password = password;
        this.contestCreated = contestCreated;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getContestCreated() {
        return contestCreated;
    }

    public void setContestCreated(List<String> contestCreated) {
        this.contestCreated = contestCreated;
    }

    private String facultyEmailId;
    private String password;
    private List<String> contestCreated;


}
