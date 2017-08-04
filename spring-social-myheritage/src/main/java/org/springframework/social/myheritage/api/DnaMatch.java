package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class DnaMatch extends MyHeritageObject{
    private final String id;
    private final DnaKit dnaKit;
    private final DnaKit otherDnaKit;
    private final List<DnaMatchRelationship> completeDnaRelationships;
    private final List<DnaMatchRelationship> refinedDnaRelationships;
    private final String exactDnaRelationship;
    private final String genealogicalRelationship;
    private final Double totalSharedSegmentsLengthInCm;
    private final Double largestSharedSegmentLengthInCm;
    private final Double percentageOfSharedSegments;
    private final Integer totalSharedSegments;
    private final LocalDateTime createdTime;
    private final LocalDateTime updatedTime;
    private final String link;

    //Connections:
    private final List<DnaMatchCommonAncestor> commonAncestors;
    private List<DnaMatchNote> matchNotes;

    public DnaMatch(String className, String id, DnaKit dnaKit, DnaKit otherDnaKit, List<DnaMatchRelationship> completeDnaRelationships, List<DnaMatchRelationship> refinedDnaRelationships, String exactDnaRelationship, String genealogicalRelationship, Double totalSharedSegmentsLengthInCm, Double largestSharedSegmentLengthInCm, Double percentageOfSharedSegments, Integer totalSharedSegments, LocalDateTime createdTime, LocalDateTime updatedTime, String link, List<DnaMatchCommonAncestor> commonAncestors, List<DnaMatchNote> matchNotes) {
        super(className);
        this.id = id;
        this.dnaKit = dnaKit;
        this.otherDnaKit = otherDnaKit;
        this.completeDnaRelationships = completeDnaRelationships;
        this.refinedDnaRelationships = refinedDnaRelationships;
        this.exactDnaRelationship = exactDnaRelationship;
        this.genealogicalRelationship = genealogicalRelationship;
        this.totalSharedSegmentsLengthInCm = totalSharedSegmentsLengthInCm;
        this.largestSharedSegmentLengthInCm = largestSharedSegmentLengthInCm;
        this.percentageOfSharedSegments = percentageOfSharedSegments;
        this.totalSharedSegments = totalSharedSegments;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.link = link;
        this.commonAncestors = commonAncestors;
        this.matchNotes = matchNotes;
    }

    public String getId() {
        return id;
    }

    public DnaKit getDnaKit() {
        return dnaKit;
    }

    public DnaKit getOtherDnaKit() {
        return otherDnaKit;
    }

    public List<DnaMatchRelationship> getCompleteDnaRelationships() {
        return completeDnaRelationships;
    }

    public List<DnaMatchRelationship> getRefinedDnaRelationships() {
        return refinedDnaRelationships;
    }

    public String getExactDnaRelationship() {
        return exactDnaRelationship;
    }

    public String getGenealogicalRelationship() {
        return genealogicalRelationship;
    }

    public Double getTotalSharedSegmentsLengthInCm() {
        return totalSharedSegmentsLengthInCm;
    }

    public Double getLargestSharedSegmentLengthInCm() {
        return largestSharedSegmentLengthInCm;
    }

    public Double getPercentageOfSharedSegments() {
        return percentageOfSharedSegments;
    }

    public Integer getTotalSharedSegments() {
        return totalSharedSegments;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public String getLink() {
        return link;
    }

    public List<DnaMatchCommonAncestor> getCommonAncestors() {
        return commonAncestors;
    }

    public List<DnaMatchNote> getMatchNotes() {
        return matchNotes;
    }

    public void setMatchNotes(List<DnaMatchNote> matchNotes) {
        this.matchNotes = matchNotes;
    }
}
