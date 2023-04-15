package com.Package.RankMyCode.Repositary;

import com.Package.RankMyCode.Collections.Contest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestRepositary extends MongoRepository<Contest,String> {
}
