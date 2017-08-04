package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class MailBox extends MyHeritageObject{

    private final String id;

    public MailBox(String className, String id) {
        super(className);
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
