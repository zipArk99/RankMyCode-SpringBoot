package com.Package.RankMyCode.Model.StudentModels;

public class StudentRegistration {
    public StudentRegistration(String email, String username, String leetcodeUsername, String codeforceUsername, String password) {
        this.email = email;
        this.username = username;
        this.leetcodeUsername = leetcodeUsername;
        this.codeforceUsername = codeforceUsername;
        this.password = password;
    }

    private String email;
    private String username;
    private String leetcodeUsername;
    private String codeforceUsername;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLeetcodeUsername() {
        return leetcodeUsername;
    }

    public void setLeetcodeUsername(String leetcodeUsername) {
        this.leetcodeUsername = leetcodeUsername;
    }

    public String getCodeforceUsername() {
        return codeforceUsername;
    }

    public void setCodeforceUsername(String codeforceUsername) {
        this.codeforceUsername = codeforceUsername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
