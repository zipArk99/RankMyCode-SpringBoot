package com.Package.RankMyCode.Repositary;

import com.Package.RankMyCode.Collections.Faculty;
import com.Package.RankMyCode.Collections.FacultyCredentials;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public interface FacultyRepositary extends MongoRepository<Faculty,String> {
public Faculty findByFacultyEmailIdAndPassword(String emailId,String password);

}
