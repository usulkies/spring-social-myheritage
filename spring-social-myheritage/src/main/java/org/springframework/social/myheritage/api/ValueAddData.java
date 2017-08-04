package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class ValueAddData extends MyHeritageObject{

    private final Photo personalPhoto;
    private final String firstName;
    private final EventDate birthDate;
    private final String birthPlace;
    private final EventDate deathDate;
    private final String deathPlace;
    private final String burialPlace;
    private final List<Event> educations;
    private final List<Event> occupations;
    private final List<Event> residences;
    private final List<Photo> additionalPhotos;
    private final List<Individual> relatives;

    public ValueAddData(String className, Photo personalPhoto, String firstName, EventDate birthDate, String birthPlace, EventDate deathDate, String deathPlace, String burialPlace, List<Event> educations, List<Event> occupations, List<Event> residences, List<Photo> additionalPhotos, List<Individual> relatives) {
        super(className);
        this.personalPhoto = personalPhoto;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.deathDate = deathDate;
        this.deathPlace = deathPlace;
        this.burialPlace = burialPlace;
        this.educations = educations;
        this.occupations = occupations;
        this.residences = residences;
        this.additionalPhotos = additionalPhotos;
        this.relatives = relatives;
    }

    public Photo getPersonalPhoto() {
        return personalPhoto;
    }

    public String getFirstName() {
        return firstName;
    }

    public EventDate getBirthDate() {
        return birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public EventDate getDeathDate() {
        return deathDate;
    }

    public String getDeathPlace() {
        return deathPlace;
    }

    public String getBurialPlace() {
        return burialPlace;
    }

    public List<Event> getEducations() {
        return educations;
    }

    public List<Event> getOccupations() {
        return occupations;
    }

    public List<Event> getResidences() {
        return residences;
    }

    public List<Photo> getAdditionalPhotos() {
        return additionalPhotos;
    }

    public List<Individual> getRelatives() {
        return relatives;
    }
}
