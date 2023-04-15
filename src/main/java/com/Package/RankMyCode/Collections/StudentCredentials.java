package com.Package.RankMyCode.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentCredentials")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentCredentials {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public StudentCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
