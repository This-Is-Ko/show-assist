package com.ko.showassist.repositories;

import com.ko.showassist.models.Episode;
import com.ko.showassist.models.EpisodeWithShow;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EpisodeRepo extends MongoRepository<Episode, String> {

    List<Episode> findByShowId(String showId);

    @Aggregation(pipeline = {
            "{ $match: { _id: ?0 } }",
            "{'$lookup':{'from':'shows','localField':'showId','foreignField':'_id','as':'show'}}",
            "{ $limit: 1 }"
    })
    EpisodeWithShow findByIdWithShow(String episodeId);
}