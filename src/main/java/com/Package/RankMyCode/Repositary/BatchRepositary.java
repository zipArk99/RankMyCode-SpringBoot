package com.Package.RankMyCode.Repositary;

import com.Package.RankMyCode.Collections.Batch;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepositary extends MongoRepository<Batch,String> {
}
