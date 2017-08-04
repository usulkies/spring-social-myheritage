package org.springframework.social.myheritage.api;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Event extends BaseEvent {
    private final String age;
    private final Individual individual;

    //Death fields:
    private final String causeOfDeath;

    //Physical:
    private final String hairColor;
    private final String eyeColor;
    private final String height;
    private final String weight;
    private final String description;



    public Event(String className, String id, String eventType, String title, EventDate date, String place, String header, String age, String link, String dataLanguage, Individual individual, Tree tree, Site site, String causeOfDeath, String hairColor, String eyeColor, String height, String weight, String description, List<MediaItem> media, List<Citation> citations, List<Note> notes) {
        super(className, header, link, date, eventType, dataLanguage, title, tree, site, place, id, media, citations, notes);
        this.age = age;
        this.individual = individual;
        this.causeOfDeath = causeOfDeath;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
        this.description = description;
    }


    public String getId() {
        return id;
    }

    public String getEventType() {
        return eventType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EventDate getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getAge() {
        return age;
    }

    public String getLink() {
        return link;
    }

    public String getDataLanguage() {
        return dataLanguage;
    }

    public Individual getIndividual() {
        return individual;
    }

    public Tree getTree() {
        return tree;
    }

    public Site getSite() {
        return site;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public List<MediaItem> getMedia() {
        return media;
    }

    public List<Citation> getCitations() {
        return citations;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public static Map<String, String> getEventTypeDescription() {
        return eventTypeDescription;
    }

    public static void setEventTypeDescription(Map<String, String> eventTypeDescription) {
        BaseEvent.eventTypeDescription = eventTypeDescription;
    }
}
