package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class DnaEthnicity extends MyHeritageObject {

    private final String region;
    private final Double percentage;

    public DnaEthnicity(String region, Double percentage, String className) {
        super(className);
        this.region = region;
        this.percentage = percentage;
    }

    public String getRegion() {
        return region;
    }

    public Double getPercentage() {
        return percentage;
    }
}
