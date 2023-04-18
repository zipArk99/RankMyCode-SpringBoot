package com.Package.RankMyCode.Controllers;

import com.Package.RankMyCode.Collections.Batch;
import com.Package.RankMyCode.Services.BatchServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/batch")
public class BatchController {
    @Autowired
    private BatchServiceInterface batchServiceObject;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Batch>> getBatchById(@PathVariable String id){
        Optional<Batch> batch= batchServiceObject.getBatchById(id);
       return ResponseEntity.of(Optional.of(batch));
    }
}
