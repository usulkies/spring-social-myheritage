package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class SmartMatch extends MyHeritageObject{

    public enum ConfirmationStatus {
        NONE, NEW, CONFIRMED, REJECTED
    }
    private final Individual individual;
    private final ConfirmationStatus status;
    private final Integer quality;


    public SmartMatch(String className, Individual individual, ConfirmationStatus status, Integer quality) {
        super(className);
        this.individual = individual;
        this.status = status;
        this.quality = quality;
    }

    public Individual getIndividual() {
        return individual;
    }

    public ConfirmationStatus getStatus() {
        return status;
    }

    public Integer getQuality() {
        return quality;
    }
}
