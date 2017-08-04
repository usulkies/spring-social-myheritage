package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 02/08/2017.
 */
public class TreeItem extends MyHeritageObject{

    private final String id;
    private final String dataLanguage;
    private final Tree tree;
    private final Site site;

    //Connections:
    private final List<MediaItem> media;
    private final List<Citation> citations;
    private final List<Note> notes;


    public TreeItem(String className, String id, String dataLanguage, Tree tree, Site site, List<MediaItem> media, List<Citation> citations, List<Note> notes) {
        super(className);
        this.id = id;
        this.dataLanguage = dataLanguage;
        this.tree = tree;
        this.site = site;
        this.media = media;
        this.citations = citations;
        this.notes = notes;
    }


    public String getId() {
        return id;
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

    public List<MediaItem> getMedia() {
        return media;
    }

    public List<Citation> getCitations() {
        return citations;
    }

    public List<Note> getNotes() {
        return notes;
    }
}
