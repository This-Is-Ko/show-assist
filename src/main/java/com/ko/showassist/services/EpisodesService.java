package com.ko.showassist.services;

import com.ko.showassist.models.Episode;
import com.ko.showassist.repositories.EpisodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodesService {
        
    @Autowired
    private EpisodeRepo episodeRepo;

    public Episode getEpisode(String episodeId) {
        Optional<Episode> episode = episodeRepo.findById(episodeId);
        if (episode.isEmpty()){
            return null;
        }
        return episode.get();
    }

    public List<Episode> getAllEpisodes() {
        return episodeRepo.findAll();
    }

    public Episode addEpisode(Episode episode) {
        return episodeRepo.save(episode);
    }

}