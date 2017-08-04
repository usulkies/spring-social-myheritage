package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class ExportGEDCOMStatus extends MyHeritageObject {

    public enum ExportStatus{
        ONLINE, OFFLINE, PENDING, DONE, FAILURE
    }
    private final String id;
    private final ExportStatus status;
    private final String url;
    private final LocalDateTime createdTime;

    public ExportGEDCOMStatus(String className, String id, ExportStatus status, String url, LocalDateTime createdTime) {
        super(className);
        this.id = id;
        this.status = status;
        this.url = url;
        this.createdTime = createdTime;
    }


    public String getId() {
        return id;
    }

    public ExportStatus getStatus() {
        return status;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }
}
