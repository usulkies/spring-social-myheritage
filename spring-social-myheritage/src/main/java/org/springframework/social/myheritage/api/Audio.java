package org.springframework.social.myheritage.api;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class Audio extends MediaItem {

    private final Duration duration;
    private String source;


    public Audio(String className, String id, String type, String name, EventDate date, String place, String description, String link, String url, List<Image> thumbnails, String extension, MyHeritageUser submitter, LocalDateTime createdTime, LocalDateTime updatedTime, Site site, List<String> keywords, List<TreeItem> items, List<Album> albums, List<Tag> tags, List<Comment> comments, Duration duration, String source) {
        super(className, id, type, name, date, place, description, link, url, thumbnails, extension, submitter, createdTime, updatedTime, site, keywords, items, albums, tags, comments);
        this.duration = duration;
        this.source = source;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
