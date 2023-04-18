package com.Package.RankMyCode.Services;
import com.Package.RankMyCode.Collections.Batch;

import java.util.List;
import java.util.Optional;

//this is batch service interface

public interface BatchServiceInterface {

    Optional<Batch> getBatchById(String id);

}
