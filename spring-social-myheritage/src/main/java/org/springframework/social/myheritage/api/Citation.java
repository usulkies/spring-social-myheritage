package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Citation extends MyHeritageObject{
    public enum CitationConfidence {
        UNSPECIFIED,
        UNRELIABLE_EVIDENCE_OR_ESTIMATED_DATA,
        QUESTIONABLE_RELIABILITY_OF_EVIDENCE,
        SECONDARY_EVIDENCE,
        DIRECT_AND_PROMARY_EVIDENCE
    }
    private final String id;
    private final String page;
    private final CitationConfidence confidence;
    private final EventDate date;
    private final String text;
    private final String link;
    private final Individual smartMatchingIndividual;
    private final String dataLanguage;
    private final Source source;
    private final TreeItem item;
    private final Tree tree;
    private final Site site;



    public Citation(String className, String id, String page, CitationConfidence confidence, EventDate date, String text, String link, Individual smartMatchingIndividual, String dataLanguage, Source source, TreeItem item, Tree tree, Site site) {
        super(className);
        this.id = id;
        this.page = page;
        this.confidence = confidence;
        this.date = date;
        this.text = text;
        this.link = link;
        this.smartMatchingIndividual = smartMatchingIndividual;
        this.dataLanguage = dataLanguage;
        this.source = source;
        this.item = item;
        this.tree = tree;
        this.site = site;
    }

    public String getId() {
        return id;
    }

    public String getPage() {
        return page;
    }

    public CitationConfidence getConfidence() {
        return confidence;
    }

    public EventDate getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public String getLink() {
        return link;
    }

    public Individual getSmartMatchingIndividual() {
        return smartMatchingIndividual;
    }

    public String getDataLanguage() {
        return dataLanguage;
    }

    public Source getSource() {
        return source;
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
