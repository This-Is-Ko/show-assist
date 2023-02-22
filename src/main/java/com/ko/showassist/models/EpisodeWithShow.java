package com.ko.showassist.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EpisodeWithShow {
    private String id;
    private Show show;
    private String title;
    private Integer season;
    private Integer episodeNum;
    private List<Video> videos;
    private List<DiscussionThread> discussionThreads;
}
