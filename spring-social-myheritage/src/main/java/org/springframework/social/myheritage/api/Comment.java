package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Comment extends MyHeritageObject{
    private final String id;
    private final String text;
    private final MyHeritageUser submitter;
    private final MediaItem mediaitem;
    private final EventDate submissionDate;

    public Comment(String id, String text, MyHeritageUser submitter, MediaItem mediaitem, EventDate submissionDate, String className) {
        super(className);
        this.id = id;
        this.text = text;
        this.submitter = submitter;
        this.mediaitem = mediaitem;
        this.submissionDate = submissionDate;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public MyHeritageUser getSubmitter() {
        return submitter;
    }

    public MediaItem getMediaitem() {
        return mediaitem;
    }

    public EventDate getSubmissionDate() {
        return submissionDate;
    }
}

