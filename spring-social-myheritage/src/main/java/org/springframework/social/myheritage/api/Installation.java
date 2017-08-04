package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Installation extends MyHeritageObject {
    private final String id;
    private String version;
    private String language;
    private final LocalDateTime firstActive;
    private final LocalDateTime lastActive;
    private final Device device;
    private final Integer clientId;
    private Boolean isEnabled;
    private final String className;

    public Installation(String id, String version, String language, LocalDateTime firstActive, LocalDateTime lastActive, Device device, Integer clientId, Boolean isEnabled, String className) {
        super(className);
        this.id = id;
        this.version = version;
        this.language = language;
        this.firstActive = firstActive;
        this.lastActive = lastActive;
        this.device = device;
        this.clientId = clientId;
        this.isEnabled = isEnabled;
        this.className = className;
    }


    public String getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LocalDateTime getFirstActive() {
        return firstActive;
    }

    public LocalDateTime getLastActive() {
        return lastActive;
    }

    public Device getDevice() {
        return device;
    }

    public Integer getClientId() {
        return clientId;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    @Override
    public String getClassName() {
        return className;
    }
}
