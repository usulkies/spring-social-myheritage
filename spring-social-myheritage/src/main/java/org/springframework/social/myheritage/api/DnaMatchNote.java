package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class DnaMatchNote extends MyHeritageObject{
    private final String id;
    private String text;
    private final MyHeritageUser author;
    private final LocalDateTime createdTime;
    private final LocalDateTime updatedTime;

    public DnaMatchNote(String className, String id, String text, MyHeritageUser author, LocalDateTime createdTime, LocalDateTime updatedTime) {
        super(className);
        this.id = id;
        this.text = text;
        this.author = author;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MyHeritageUser getAuthor() {
        return author;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }
}
