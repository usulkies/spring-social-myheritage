package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class EventPlace extends MyHeritageObject {

    private final String country;
    private final String stateOrProvince;


    public EventPlace(String className, String country, String stateOrProvince) {
        super(className);
        this.country = country;
        this.stateOrProvince = stateOrProvince;
    }

    public String getCountry() {
        return country;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }
}
