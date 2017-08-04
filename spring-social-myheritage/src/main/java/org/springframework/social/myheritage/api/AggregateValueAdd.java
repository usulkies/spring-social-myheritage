package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class AggregateValueAdd extends MyHeritageObject {
    private final ValueAddElement smartMatches;
    private final ValueAddElement recordMatches;
    private final ValueAddElement all;

    public AggregateValueAdd(ValueAddElement smartMatches, ValueAddElement recordMatches, ValueAddElement all, String className) {
        super(className);
        this.smartMatches = smartMatches;
        this.recordMatches = recordMatches;
        this.all = all;
    }

    public ValueAddElement getSmartMatches() {
        return smartMatches;
    }

    public ValueAddElement getRecordMatches() {
        return recordMatches;
    }

    public ValueAddElement getAll() {
        return all;
    }
}
