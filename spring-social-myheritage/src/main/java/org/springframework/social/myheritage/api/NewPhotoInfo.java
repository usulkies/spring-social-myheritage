package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class NewPhotoInfo extends MyHeritageObject{

    private final String id;
    private final Photo personalPhoto;
    private final Individual individual;
    private final Individual otherIndividual;
    private final Double tagX;
    private final Double tagY;
    private final Double tagWidth;
    private final Double tagHeight;

    public NewPhotoInfo(String className, String id, Photo personalPhoto, Individual individual, Individual otherIndividual, Double tagX, Double tagY, Double tagWidth, Double tagHeight) {
        super(className);
        this.id = id;
        this.personalPhoto = personalPhoto;
        this.individual = individual;
        this.otherIndividual = otherIndividual;
        this.tagX = tagX;
        this.tagY = tagY;
        this.tagWidth = tagWidth;
        this.tagHeight = tagHeight;
    }

    public String getId() {
        return id;
    }

    public Photo getPersonalPhoto() {
        return personalPhoto;
    }

    public Individual getIndividual() {
        return individual;
    }

    public Individual getOtherIndividual() {
        return otherIndividual;
    }

    public Double getTagX() {
        return tagX;
    }

    public Double getTagY() {
        return tagY;
    }

    public Double getTagWidth() {
        return tagWidth;
    }

    public Double getTagHeight() {
        return tagHeight;
    }
}
