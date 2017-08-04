package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class DiscoveryBase extends MyHeritageObject {

    public enum DiscoveryStatus {NEW, APPLYING, APPLIED, SKIPPED, REFRESHING, TRIGGER_REFRESH}

    private final String id;
    private final String link;
    private DiscoveryStatus status;
    private final Integer score;
    private final Boolean isApplicable;

    public DiscoveryBase(String className, String id, String link, DiscoveryStatus status, Integer score, Boolean isApplicable) {
        super(className);
        this.id = id;
        this.link = link;
        this.status = status;
        this.score = score;
        this.isApplicable = isApplicable;
    }

    public String getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public DiscoveryStatus getStatus() {
        return status;
    }

    public void setStatus(DiscoveryStatus status) {
        this.status = status;
    }

    public Integer getScore() {
        return score;
    }

    public Boolean getApplicable() {
        return isApplicable;
    }
}
