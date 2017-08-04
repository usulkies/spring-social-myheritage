package org.springframework.social.myheritage.api;

import java.util.List;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class FamilyEvent extends BaseEvent{

    private final String ageHusband;
    private final String ageWife;
    private final Family family;


    public FamilyEvent(String className, String header, String link, EventDate date, String eventType, String dataLanguage, String title, Tree tree, Site site, String place, String id, List<MediaItem> media, List<Citation> citations, List<Note> notes, String ageHusband, String ageWife, Family family) {
        super(className, header, link, date, eventType, dataLanguage, title, tree, site, place, id, media, citations, notes);
        this.ageHusband = ageHusband;
        this.ageWife = ageWife;
        this.family = family;
    }

    public String getAgeHusband() {
        return ageHusband;
    }

    public String getAgeWife() {
        return ageWife;
    }

    public Family getFamily() {
        return family;
    }
}
