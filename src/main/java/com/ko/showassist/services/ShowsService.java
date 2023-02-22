package com.ko.showassist.services;

import com.ko.showassist.repositories.ShowRepo;
import com.ko.showassist.models.Show;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowsService {
        
    @Autowired
    private ShowRepo showRepo;

    public List<Show> getAllShows() {
        List<Show> allShows = showRepo.findAll();
        return allShows;
    }

}