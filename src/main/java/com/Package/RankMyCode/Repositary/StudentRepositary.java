package com.Package.RankMyCode.Repositary;

import com.Package.RankMyCode.Collections.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepositary extends MongoRepository<Student,String> {
    public List<Student> findBybatchNumber(String batchList);
}
