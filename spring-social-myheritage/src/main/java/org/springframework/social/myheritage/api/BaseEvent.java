package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Uziel Sulkies on 04/08/2017.
 */
public class BaseEvent extends MyHeritageObject{


    protected static Map<String,String> eventTypeDescription;
    protected final String id;
    protected final String eventType;
    protected String title;
    protected final EventDate date;
    protected String place;
    protected String header;

    protected final String link;
    protected final String dataLanguage;
    protected final Tree tree;
    protected final Site site;

    //Connections
    protected final List<MediaItem> media;
    protected final List<Citation> citations;
    protected final List<Note> notes;

    public BaseEvent(String className, String header, String link, EventDate date, String eventType, String dataLanguage, String title, Tree tree, Site site, String place, String id, List<MediaItem> media, List<Citation> citations, List<Note> notes) {
        super(className);
        this.header = header;
        this.link = link;
        this.date = date;
        this.eventType = eventType;
        this.dataLanguage = dataLanguage;
        this.title = title;
        this.tree = tree;
        this.site = site;
        this.place = place;
        this.id = id;
        this.media = media;
        this.citations = citations;
        this.notes = notes;
    }

    static {
        try {
            eventTypeDescription = Files.lines(Paths.get(Event.class.getResource("EventTypes.txt").toURI()))
                    .map(line -> line.split(":"))
                    .collect(Collectors.toMap(o -> o[0], o -> o[1]));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
