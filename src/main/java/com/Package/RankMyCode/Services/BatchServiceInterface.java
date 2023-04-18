package com.Package.RankMyCode.Services;
import com.Package.RankMyCode.Collections.Batch;

import java.util.List;
import java.util.Optional;

public interface BatchServiceInterface {

    Optional<Batch> getBatchById(String id);

}
