package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class RecordMatchesCount extends MyHeritageObject {

    private final Individual individual;
    private final Integer count;
    private final String link;

    public RecordMatchesCount(String className, Individual individual, Integer count, String link) {
        super(className);
        this.individual = individual;
        this.count = count;
        this.link = link;
    }

    public Individual getIndividual() {
        return individual;
    }

    public Integer getCount() {
        return count;
    }

    public String getLink() {
        return link;
    }
}
