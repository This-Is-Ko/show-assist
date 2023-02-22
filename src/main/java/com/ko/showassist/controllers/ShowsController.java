package com.ko.showassist.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.ko.showassist.models.Show;
import com.ko.showassist.services.ShowsService;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/shows")
public class ShowsController {

    @Autowired
    private ShowsService showsService;

    // @GetMapping("/{id}")
    // public ResponseEntity<Show> getShowById(@PathVariable String id) {
    //     Optional<Show> show = showRepo.findById(id);
    //     if (show.isPresent()) {
    //         return ResponseEntity.ok(show.get());
    //     } else {
    //         return ResponseEntity.notFound().build();
    //     }
    // }

    @GetMapping("/")
    public List<Show> getAllShows() {
        return showsService.getAllShows();
    }
}