package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class DnaMatchCommonAncestor extends MyHeritageObject {
    private final String surname;
    private final String otherSurname;
    private final DnaAncestorName name;
    private final DnaAncestorName otherName;
    private final Integer nameCount;
    private final Integer otherNameCount;
    private final String closestRelationship;
    private final String otherClosestRelationship;
    private final String closestRelationshipSide;
    private final String otherClosestRelationshipSide;


    public DnaMatchCommonAncestor(String surname, String otherSurname, DnaAncestorName name, DnaAncestorName otherName, Integer nameCount, Integer otherNameCount, String closestRelationship, String otherClosestRelationship, String closestRelationshipSide, String otherClosestRelationshipSide, String className) {
        super (className);
        this.surname = surname;
        this.otherSurname = otherSurname;
        this.name = name;
        this.otherName = otherName;
        this.nameCount = nameCount;
        this.otherNameCount = otherNameCount;
        this.closestRelationship = closestRelationship;
        this.otherClosestRelationship = otherClosestRelationship;
        this.closestRelationshipSide = closestRelationshipSide;
        this.otherClosestRelationshipSide = otherClosestRelationshipSide;
    }


    public String getSurname() {
        return surname;
    }

    public String getOtherSurname() {
        return otherSurname;
    }

    public DnaAncestorName getName() {
        return name;
    }

    public DnaAncestorName getOtherName() {
        return otherName;
    }

    public Integer getNameCount() {
        return nameCount;
    }

    public Integer getOtherNameCount() {
        return otherNameCount;
    }

    public String getClosestRelationship() {
        return closestRelationship;
    }

    public String getOtherClosestRelationship() {
        return otherClosestRelationship;
    }

    public String getClosestRelationshipSide() {
        return closestRelationshipSide;
    }

    public String getOtherClosestRelationshipSide() {
        return otherClosestRelationshipSide;
    }
}
