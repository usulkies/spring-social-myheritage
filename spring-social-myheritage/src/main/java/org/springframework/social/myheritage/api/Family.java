package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Family extends MyHeritageObject{

    public  enum FamilyStatus{
        UNKNOWN, FRIENDS, PARTNERS, ENGAGED, MARRIED, SEPARATED, ANNULLED, DIVORCED, OTHER, WIDOWED
    }
    private final String id;
    private FamilyStatus status;
    private Individual husband;
    private Individual wife;
    private String link;
    private EventDate marriageDate;
    private List<ChildInFamily> children;
    private final Tree tree;
    private final Site site;


    public Family(String className, String id, FamilyStatus status, Individual husband, Individual wife, String link, EventDate marriageDate, List<ChildInFamily> children, Tree tree, Site site) {
        super(className);
        this.id = id;
        this.status = status;
        this.husband = husband;
        this.wife = wife;
        this.link = link;
        this.marriageDate = marriageDate;
        this.children = children;
        this.tree = tree;
        this.site = site;
    }

    public String getId() {
        return id;
    }

    public FamilyStatus getStatus() {
        return status;
    }

    public void setStatus(FamilyStatus status) {
        this.status = status;
    }

    public Individual getHusband() {
        return husband;
    }

    public void setHusband(Individual husband) {
        this.husband = husband;
    }

    public Individual getWife() {
        return wife;
    }

    public void setWife(Individual wife) {
        this.wife = wife;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public EventDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(EventDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    public List<ChildInFamily> getChildren() {
        return children;
    }

    public void setChildren(List<ChildInFamily> children) {
        this.children = children;
    }

    public Tree getTree() {
        return tree;
    }

    public Site getSite() {
        return site;
    }
}
