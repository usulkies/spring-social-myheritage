package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 02/08/2017.
 */
public class Source extends MyHeritageObject {

    private final String id;
    private final String name;
    private final String abbreiation;
    private final String author;
    private final String publisher;
    private final String agency;
    private final String description;
    private final String link;
    private final LocalDateTime updatedTime;
    private final String type;
    private final String dataLanguage;
    private final Tree tree;
    private final Site site;
    private final Site smartMatchingSite;
    private final Tree smartMatchingTree;

    //Connections:
    private final List<Citation> citations;
    private final List<MediaItem> media;


    public Source(String className, String id, String name, String abbreiation, String author, String publisher, String agency, String description, String link, LocalDateTime updatedTime, String type, String dataLanguage, Tree tree, Site site, Site smartMatchingSite, Tree smartMatchingTree, List<Citation> citations, List<MediaItem> media) {
        super(className);
        this.id = id;
        this.name = name;
        this.abbreiation = abbreiation;
        this.author = author;
        this.publisher = publisher;
        this.agency = agency;
        this.description = description;
        this.link = link;
        this.updatedTime = updatedTime;
        this.type = type;
        this.dataLanguage = dataLanguage;
        this.tree = tree;
        this.site = site;
        this.smartMatchingSite = smartMatchingSite;
        this.smartMatchingTree = smartMatchingTree;
        this.citations = citations;
        this.media = media;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAbbreiation() {
        return abbreiation;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAgency() {
        return agency;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public String getType() {
        return type;
    }

    public String getDataLanguage() {
        return dataLanguage;
    }

    public Tree getTree() {
        return tree;
    }

    public Site getSite() {
        return site;
    }

    public Site getSmartMatchingSite() {
        return smartMatchingSite;
    }

    public Tree getSmartMatchingTree() {
        return smartMatchingTree;
    }

    public List<Citation> getCitations() {
        return citations;
    }

    public List<MediaItem> getMedia() {
        return media;
    }
}
