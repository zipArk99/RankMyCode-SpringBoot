package com.Package.RankMyCode.Services;

import com.Package.RankMyCode.Collections.Batch;
import com.Package.RankMyCode.Repositary.BatchRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatchServiceClass implements   BatchServiceInterface{

    @Autowired
    private BatchRepositary batchRepositary;
    @Override
    public Optional<Batch> getBatchById(String id) {
         return batchRepositary.findById(id);

    }
}
