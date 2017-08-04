package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Relationship extends MyHeritageObject{

    private Individual individual;
    private RelationshipType relationshipType;
    private String relationshipDescription;

    public Relationship(String className) {
        super(className);
    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    public String getRelationshipDescription() {
        return relationshipDescription;
    }

    public void setRelationshipDescription(String relationshipDescription) {
        this.relationshipDescription = relationshipDescription;
    }

    public enum RelationshipType{
        FATHER,
        MOTHER,
        PARENT,
        SON,
        DAUGHTER,
        CHILD,
        BROTHER,
        SISTER,
        SIBLING,
        HUSBAND,
        WIFE,
        PARTNER,
        EX_HUSBAND,
        EX_WIFE,
        EX_PARTNER,
        GRANDFATHER,
        GRANDMOTHER,
        GRANDPARENT,
        GRANDSON,
        GRANDDAUGHTER,
        GRANDCHILD,
        UNCLE,
        AUNT,
        NIECE,
        NEPHEW,

    }
}
