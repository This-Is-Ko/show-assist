package com.ko.showassist.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document("episodes")
public class Episode {

    @Id
    private String id;
    private String showId;
    private String title;
    private Integer season;
    private Integer episodeNum;
    private List<Video> videos;
    private List<DiscussionThread> discussionThreads;

}
