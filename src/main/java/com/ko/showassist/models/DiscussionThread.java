package com.ko.showassist.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DiscussionThread {

    private String title;
    private String uri;
    private Date createdDate;

}
