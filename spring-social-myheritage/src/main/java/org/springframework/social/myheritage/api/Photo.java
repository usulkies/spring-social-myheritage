package org.springframework.social.myheritage.api;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Photo extends MediaItem {
    private final Integer width;
    private final Integer height;
    private final Boolean hasReverseSlide;
    private final Integer reverseSideWidth;
    private final Integer reverseSideHeight;
    private final List<Image> reverseSideImages;
    private Boolean isPersonalPhoto;
    private final Individual personalPhotoIndividual;
    private String source;


    public Photo(String className, String id, String type, String name, EventDate date, String place, String description, String link, String url, List<Image> thumbnails, String extension, MyHeritageUser submitter, LocalDateTime createdTime, LocalDateTime updatedTime, Site site, List<String> keywords, List<TreeItem> items, List<Album> albums, List<Tag> tags, List<Comment> comments, Integer width, Integer height, Boolean hasReverseSlide, Integer reverseSideWidth, Integer reverseSideHeight, List<Image> reverseSideImages, Boolean isPersonalPhoto, Individual personalPhotoIndividual, String source) {
        super(className, id, type, name, date, place, description, link, url, thumbnails, extension, submitter, createdTime, updatedTime, site, keywords, items, albums, tags, comments);
        this.width = width;
        this.height = height;
        this.hasReverseSlide = hasReverseSlide;
        this.reverseSideWidth = reverseSideWidth;
        this.reverseSideHeight = reverseSideHeight;
        this.reverseSideImages = reverseSideImages;
        this.isPersonalPhoto = isPersonalPhoto;
        this.personalPhotoIndividual = personalPhotoIndividual;
        this.source = source;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Boolean getHasReverseSlide() {
        return hasReverseSlide;
    }

    public Integer getReverseSideWidth() {
        return reverseSideWidth;
    }

    public Integer getReverseSideHeight() {
        return reverseSideHeight;
    }

    public List<Image> getReverseSideImages() {
        return reverseSideImages;
    }

    public Boolean getPersonalPhoto() {
        return isPersonalPhoto;
    }

    public void setPersonalPhoto(Boolean personalPhoto) {
        isPersonalPhoto = personalPhoto;
    }

    public Individual getPersonalPhotoIndividual() {
        return personalPhotoIndividual;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
