package com.Package.RankMyCode.Repositary;

import com.Package.RankMyCode.Collections.Contest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContestRepositary extends MongoRepository<Contest,String> {

    @Query()
public List<String> getArray();
}
