package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class Document extends MediaItem {

    private String source;


    public Document(String className, String id, String type, String name, EventDate date, String place, String description, String link, String url, List<Image> thumbnails, String extension, MyHeritageUser submitter, LocalDateTime createdTime, LocalDateTime updatedTime, Site site, List<String> keywords, List<TreeItem> items, List<Album> albums, List<Tag> tags, List<Comment> comments) {
        super(className, id, type, name, date, place, description, link, url, thumbnails, extension, submitter, createdTime, updatedTime, site, keywords, items, albums, tags, comments);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
