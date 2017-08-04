package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class MatchesCount extends MyHeritageObject {
    public enum MatchType {RECORD_MATCH, SMART_MATCH}

    private final MatchType matchType;
    private final Integer pending;
    private final Integer confirmed;
    private final Integer rejected;
    private final Integer total;
    private final Integer neww;
    private final Integer ignoredSources;
    private final Integer ignoredIndividuals;
    private final ValueAddElement aggregatedValueAdd;


    public MatchesCount(String className, MatchType matchType, Integer pending, Integer confirmed, Integer rejected, Integer total, Integer neww, Integer ignoredSources, Integer ignoredIndividuals, ValueAddElement aggregatedValueAdd) {
        super(className);
        this.matchType = matchType;
        this.pending = pending;
        this.confirmed = confirmed;
        this.rejected = rejected;
        this.total = total;
        this.neww = neww;
        this.ignoredSources = ignoredSources;
        this.ignoredIndividuals = ignoredIndividuals;
        this.aggregatedValueAdd = aggregatedValueAdd;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public Integer getPending() {
        return pending;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public Integer getRejected() {
        return rejected;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getNeww() {
        return neww;
    }

    public Integer getIgnoredSources() {
        return ignoredSources;
    }

    public Integer getIgnoredIndividuals() {
        return ignoredIndividuals;
    }

    public ValueAddElement getAggregatedValueAdd() {
        return aggregatedValueAdd;
    }
}
