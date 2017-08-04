package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Note extends MyHeritageObject{

    private final String id;
    private final String text;
    private final String limk;
    private final String dataLanguage;
    private final TreeItem item;
    private final Tree tree;
    private final Site site;

    public Note(String className, String id, String text, String limk, String dataLanguage, TreeItem item, Tree tree, Site site) {
        super(className);
        this.id = id;
        this.text = text;
        this.limk = limk;
        this.dataLanguage = dataLanguage;
        this.item = item;
        this.tree = tree;
        this.site = site;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getLimk() {
        return limk;
    }

    public String getDataLanguage() {
        return dataLanguage;
    }

    public TreeItem getItem() {
        return item;
    }

    public Tree getTree() {
        return tree;
    }

    public Site getSite() {
        return site;
    }
}
