package com.ko.showassist.controllers;

import com.ko.showassist.models.Episode;
import com.ko.showassist.models.EpisodeWithShow;
import com.ko.showassist.services.EpisodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/episodes")
public class EpisodesController {

    @Autowired
    private EpisodesService episodesService;

     @GetMapping("/{id}/details")
     public ResponseEntity<Episode> getEpisodeById(@PathVariable String id) {
         Episode episode = episodesService.getEpisode(id);
         if (episode != null) {
             return ResponseEntity.ok(episode);
         } else {
             return ResponseEntity.notFound().build();
         }
     }

//    @GetMapping("/")
//    public List<Episode> getAllEpisode() {
//        return episodesService.getAllEpisodes();
//    }
}