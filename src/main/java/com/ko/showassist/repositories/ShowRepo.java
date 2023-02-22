package com.ko.showassist.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ko.showassist.models.Show;

public interface ShowRepo extends MongoRepository<Show, String> {
}