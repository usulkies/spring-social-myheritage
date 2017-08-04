package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class RecordIndividual extends MyHeritageObject{

    private final String id;
    private final String name;
    private final String gender;
    private final String relationship;
    private final String personalPhoto;

    public RecordIndividual(String className, String id, String name, String gender, String relationship, String personalPhoto) {
        super(className);
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.relationship = relationship;
        this.personalPhoto = personalPhoto;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getPersonalPhoto() {
        return personalPhoto;
    }
}
