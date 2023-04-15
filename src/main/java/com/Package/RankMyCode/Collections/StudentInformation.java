package com.Package.RankMyCode.Collections;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentInformation")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentInformation {

    private String leetcodeUsername;
    private String codeforceUsername;
    public String getLeetcodeUsername() {
        return leetcodeUsername;
    }

    public void setLeetcodeUsername(String leetcodeUsername) {
        this.leetcodeUsername = leetcodeUsername;
    }

    public StudentInformation(String leetcodeUsername, String codeforceUsername) {
        this.leetcodeUsername = leetcodeUsername;
        this.codeforceUsername = codeforceUsername;
    }

    public String getCodeforceUsername() {
        return codeforceUsername;
    }

    public void setCodeforceUsername(String codeforceUsername) {
        this.codeforceUsername = codeforceUsername;
    }


}
