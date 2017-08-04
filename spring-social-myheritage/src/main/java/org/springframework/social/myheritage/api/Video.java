package org.springframework.social.myheritage.api;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class Video extends MediaItem {

    private final Integer width;
    private final Integer height;
    private final Duration dutration;
    private String source;


    public Video(String className, String id, String type, String name, EventDate date, String place, String description, String link, String url, List<Image> thumbnails, String extension, MyHeritageUser submitter, LocalDateTime createdTime, LocalDateTime updatedTime, Site site, List<String> keywords, List<TreeItem> items, List<Album> albums, List<Tag> tags, List<Comment> comments, Integer width, Integer height, Duration dutration, String source) {
        super(className, id, type, name, date, place, description, link, url, thumbnails, extension, submitter, createdTime, updatedTime, site, keywords, items, albums, tags, comments);
        this.width = width;
        this.height = height;
        this.dutration = dutration;
        this.source = source;
    }


    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Duration getDutration() {
        return dutration;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
