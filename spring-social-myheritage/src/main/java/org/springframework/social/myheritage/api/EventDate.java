package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class EventDate extends MyHeritageObject {
    private String gedcom;
    private final String text;
    private final LocalDateTime date;
    private StructuredDate structuredDate;

    public EventDate(String className, String gedcom, String text, LocalDateTime date, StructuredDate structuredDate) {
        super(className);
        this.gedcom = gedcom;
        this.text = text;
        this.date = date;
        this.structuredDate = structuredDate;
    }


    public String getGedcom() {
        return gedcom;
    }

    public void setGedcom(String gedcom) {
        this.gedcom = gedcom;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public StructuredDate getStructuredDate() {
        return structuredDate;
    }

    public void setStructuredDate(StructuredDate structuredDate) {
        this.structuredDate = structuredDate;
    }
}
