package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class DnaMatchRelationship extends MyHeritageObject {
    private final Integer relationshipType;
    private final String relationshipDegree;

    public DnaMatchRelationship(String className, Integer relationshipType, String relationshipDegree) {
        super(className);
        this.relationshipType = relationshipType;
        this.relationshipDegree = relationshipDegree;
    }

    public Integer getRelationshipType() {
        return relationshipType;
    }

    public String getRelationshipDegree() {
        return relationshipDegree;
    }
}
