package com.ko.showassist.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Setter;
import lombok.Getter;

@Getter 
@Setter
@Document("shows")
public class Show {
    
    @Id
    private String id;
    private String name;
    private Integer releasedYear;
    private Integer seasons;

}
