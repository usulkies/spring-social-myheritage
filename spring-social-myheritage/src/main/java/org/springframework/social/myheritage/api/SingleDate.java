package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class SingleDate extends MyHeritageObject {
    private Integer day;
    private Integer month;
    private Integer year;
    private DateType type;

    public SingleDate(String className, Integer day, Integer month, Integer year, DateType type) {
        super(className);
        this.day = day;
        this.month = month;
        this.year = year;
        this.type = type;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public DateType getType() {
        return type;
    }

    public void setType(DateType type) {
        this.type = type;
    }
}
