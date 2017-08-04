package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Album extends MyHeritageObject{

    private final String id;
    private String name;
    private String description;
    private final String link;
    private final MyHeritageUser submitter;
    private final LocalDateTime createdTime;
    private final LocalDateTime updatedTime;
    private final Integer mediaCount;
    private Boolean is_public;
    private final Boolean isDefaultFamilyAlbum;
    private final Site site;
    private final Photo coverPhoto;

    //Connections
    private final List<String> keywords;
    private List<MediaItem> media;

    public Album(String id, String name, String description, String link, MyHeritageUser submitter, LocalDateTime createdTime, LocalDateTime updatedTime, Integer mediaCount, Boolean is_public, Boolean isDefaultFamilyAlbum, Site site, Photo coverPhoto, String className, List<String> keywords, List<MediaItem> media) {
        super(className);
        this.id = id;
        this.name = name;
        this.description = description;
        this.link = link;
        this.submitter = submitter;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.mediaCount = mediaCount;
        this.is_public = is_public;
        this.isDefaultFamilyAlbum = isDefaultFamilyAlbum;
        this.site = site;
        this.coverPhoto = coverPhoto;
        this.keywords = keywords;
        this.media = media;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
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

    public Integer getMediaCount() {
        return mediaCount;
    }

    public Boolean getIs_public() {
        return is_public;
    }

    public void setIs_public(Boolean is_public) {
        this.is_public = is_public;
    }

    public Boolean getDefaultFamilyAlbum() {
        return isDefaultFamilyAlbum;
    }

    public Site getSite() {
        return site;
    }

    public Photo getCoverPhoto() {
        return coverPhoto;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public List<MediaItem> getMedia() {
        return media;
    }

    public void setMedia(List<MediaItem> media) {
        this.media = media;
    }
}
