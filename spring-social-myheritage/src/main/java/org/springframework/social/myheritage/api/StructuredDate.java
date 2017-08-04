package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class StructuredDate extends MyHeritageObject{
    private SingleDate firstDate;
    private SingleDate secondDate;
    private DateType type;

    public StructuredDate(String className, SingleDate firstDate, SingleDate secondDate, DateType type) {
        super(className);
        this.firstDate = firstDate;
        this.secondDate = secondDate;
        this.type = type;
    }

    public SingleDate getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(SingleDate firstDate) {
        this.firstDate = firstDate;
    }

    public SingleDate getSecondDate() {
        return secondDate;
    }

    public void setSecondDate(SingleDate secondDate) {
        this.secondDate = secondDate;
    }

    public DateType getType() {
        return type;
    }

    public void setType(DateType type) {
        this.type = type;
    }
}
