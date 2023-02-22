package com.ko.showassist.controllers;

import com.ko.showassist.models.Episode;
import com.ko.showassist.models.Show;
import com.ko.showassist.services.ShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowsController {

    @Autowired
    private ShowsService showsService;

    @GetMapping("/{showId}/details")
    public ResponseEntity<Show> getShowById(@PathVariable String showId) {
        Show show = showsService.getShow(showId);
        if (show != null) {
            return ResponseEntity.ok(show);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{showId}/episodes")
    public List<Episode> getShowEpisodes(@PathVariable String showId) {
        return showsService.getShowEpisodes(showId);
    }

    @GetMapping("/")
    public List<Show> getAllShows() {
        return showsService.getAllShows();
    }
}