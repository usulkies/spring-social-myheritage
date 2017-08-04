package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Membership extends MyHeritageObject{

    private final Site site;
    private final MyHeritageUser user;
    private final Boolean isManager;
    private final LocalDateTime lastVisitTime;
    private final Integer visitCount;
    private final Individual individual;



    public Membership(String className, Site site, MyHeritageUser user, Boolean isManager, LocalDateTime lastVisitTime, Integer visitCount, Individual individual) {
        super(className);
        this.site = site;
        this.user = user;
        this.isManager = isManager;
        this.lastVisitTime = lastVisitTime;
        this.visitCount = visitCount;
        this.individual = individual;
    }


    public Site getSite() {
        return site;
    }

    public MyHeritageUser getUser() {
        return user;
    }

    public Boolean getManager() {
        return isManager;
    }

    public LocalDateTime getLastVisitTime() {
        return lastVisitTime;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public Individual getIndividual() {
        return individual;
    }
}
