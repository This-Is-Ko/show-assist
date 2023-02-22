package com.ko.showassist.services;

import com.ko.showassist.models.Episode;
import com.ko.showassist.repositories.EpisodeRepo;
import com.ko.showassist.repositories.ShowRepo;
import com.ko.showassist.models.Show;
import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ShowsService {
        
    @Autowired
    private ShowRepo showRepo;

    @Autowired
    private EpisodeRepo episodeRepo;

    public Show getShow(String showId) {
        Optional<Show> show = showRepo.findById(showId);
        if (show.isEmpty()){
            return null;
        }
        return show.get();
    }

    public List<Episode> getShowEpisodes(String showId) {
        List<Episode> episodes = episodeRepo.findByShowId(showId);
        log.debug(String.format("Show: %s - Found %d episodes", showId, episodes.size()));
        return episodes;
    }

    public List<Show> getAllShows() {
        return showRepo.findAll();
    }

    public Show addShow(Show show) {
        return showRepo.save(show);
    }

}