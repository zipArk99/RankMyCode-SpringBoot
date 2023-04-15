package com.Package.RankMyCode.Repositary;

import com.Package.RankMyCode.Collections.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositary extends MongoRepository<Student,String> {
}
