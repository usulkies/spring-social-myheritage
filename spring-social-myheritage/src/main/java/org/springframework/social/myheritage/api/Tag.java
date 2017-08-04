package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Tag extends MyHeritageObject{

    private final String id;
    private Individual individual;
    private final MediaItem mediaItem;
    private Double x;
    private Double y;
    private Double w;
    private Double h;
    private Boolean isPersonalPhoto;



    public Tag(String className, String id, Individual individual, MediaItem mediaItem, Double x, Double y, Double w, Double h, Boolean isPersonalPhoto) {
        super(className);
        this.id = id;
        this.individual = individual;
        this.mediaItem = mediaItem;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.isPersonalPhoto = isPersonalPhoto;
    }

    public String getId() {
        return id;
    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public MediaItem getMediaItem() {
        return mediaItem;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getW() {
        return w;
    }

    public void setW(Double w) {
        this.w = w;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Boolean getPersonalPhoto() {
        return isPersonalPhoto;
    }

    public void setPersonalPhoto(Boolean personalPhoto) {
        isPersonalPhoto = personalPhoto;
    }
}
