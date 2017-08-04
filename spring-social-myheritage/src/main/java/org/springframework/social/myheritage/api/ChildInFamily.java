package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class ChildInFamily extends MyHeritageObject{

    public enum ChildType {
        ADOPTED, FOSTER, BIOLOGICAL
    }
    private Individual child;
    private Family family;
    private ChildType childType;


    public ChildInFamily(String className, Individual child, Family family, ChildType childType) {
        super(className);
        this.child = child;
        this.family = family;
        this.childType = childType;
    }

    public Individual getChild() {
        return child;
    }

    public void setChild(Individual child) {
        this.child = child;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public ChildType getChildType() {
        return childType;
    }

    public void setChildType(ChildType childType) {
        this.childType = childType;
    }
}
