package com.Package.RankMyCode.Controllers;

import com.Package.RankMyCode.Collections.Batch;
import com.Package.RankMyCode.Collections.Contest;
import com.Package.RankMyCode.Services.ContestServiceClass;
import com.Package.RankMyCode.Services.ContestServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contest")
public class ContestController {
    @Autowired
    ContestServiceInterface contestServiceObject;
    @PostMapping(value ="/getContests",consumes = "application/json")
    public ResponseEntity<List<Contest>> getListOfContest(@RequestBody Batch batch){
    List<Contest> contestList= contestServiceObject.getListOfContest(batch);
    if(contestList.isEmpty()){
    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    return ResponseEntity.of(Optional.of(contestList));
    }
}
