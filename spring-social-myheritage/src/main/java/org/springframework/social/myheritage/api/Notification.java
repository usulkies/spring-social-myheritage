package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class Notification extends MyHeritageObject {

    public enum NotificationStatus{NOTIFIED, CLICKED}
    private final String id;
    private final NotificationStatus status;

    public Notification(String className, String id, NotificationStatus status) {
        super(className);
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public NotificationStatus getStatus() {
        return status;
    }
}
