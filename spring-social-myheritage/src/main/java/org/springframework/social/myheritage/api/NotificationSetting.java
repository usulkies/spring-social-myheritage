package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class NotificationSetting extends MyHeritageObject {

    public enum Entity {SMART_MATCH, RECORD_MATCH, INSTANT_DISCOVERY, BIRTHDAY, WEDDING_ANNIVERSARY}
    private final String id;
    private String type;
    private Entity entity;
    private Boolean isEnabled;

    public NotificationSetting(String className, String id, String type, Entity entity) {
        super(className);
        this.id = id;
        this.type = type;
        this.entity = entity;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }
}
