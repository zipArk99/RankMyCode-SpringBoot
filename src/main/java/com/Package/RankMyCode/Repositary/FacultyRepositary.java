package com.Package.RankMyCode.Repositary;

import com.Package.RankMyCode.Collections.Faculty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepositary extends MongoRepository<Faculty,String> {
}
