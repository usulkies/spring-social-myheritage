package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class ConfirmationStatus extends MyHeritageObject {

    private SmartMatch.ConfirmationStatus status;
    private final LocalDateTime time;
    private final MyHeritageUser user;

    public ConfirmationStatus(String className, SmartMatch.ConfirmationStatus status, LocalDateTime time, MyHeritageUser user) {
        super(className);
        this.status = status;
        this.time = time;
        this.user = user;
    }

    public SmartMatch.ConfirmationStatus getStatus() {
        return status;
    }

    public void setStatus(SmartMatch.ConfirmationStatus status) {
        this.status = status;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public MyHeritageUser getUser() {
        return user;
    }
}
