package com.ko.showassist.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Video {
    private String title;
    private String type;
    private String uri;
    private Date releasedDate;
}
