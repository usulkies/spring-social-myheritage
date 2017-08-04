package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class MediaItem extends MyHeritageObject{

    private final String id;
    private final String type;
    private final String name;
    private final EventDate date;
    private final String place;
    private final String description;
    private final String link;
    private final String url;
    private final List<Image> thumbnails;
    private final String extension;
    private final MyHeritageUser submitter;
    private final LocalDateTime createdTime;
    private final LocalDateTime updatedTime;
    private final Site site;

    //Connections:
    private final List<String> keywords;
    private final List<TreeItem> items;
    private final List<Album> albums;
    private final List<Tag> tags;
    private final List<Comment> comments;

    public MediaItem(String className, String id, String type, String name, EventDate date, String place, String description, String link, String url, List<Image> thumbnails, String extension, MyHeritageUser submitter, LocalDateTime createdTime, LocalDateTime updatedTime, Site site, List<String> keywords, List<TreeItem> items, List<Album> albums, List<Tag> tags, List<Comment> comments) {
        super(className);
        this.id = id;
        this.type = type;
        this.name = name;
        this.date = date;
        this.place = place;
        this.description = description;
        this.link = link;
        this.url = url;
        this.thumbnails = thumbnails;
        this.extension = extension;
        this.submitter = submitter;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.site = site;
        this.keywords = keywords;
        this.items = items;
        this.albums = albums;
        this.tags = tags;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public EventDate getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getUrl() {
        return url;
    }

    public List<Image> getThumbnails() {
        return thumbnails;
    }

    public String getExtension() {
        return extension;
    }

    public MyHeritageUser getSubmitter() {
        return submitter;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public Site getSite() {
        return site;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public List<TreeItem> getItems() {
        return items;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
