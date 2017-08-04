package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class Config extends MyHeritageObject{

    private final String id;
    private final String key;
    private final String value;
    private final Boolean isQa;

    public Config(String className, String id, String key, String value, Boolean isQa) {
        super(className);
        this.id = id;
        this.key = key;
        this.value = value;
        this.isQa = isQa;
    }

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Boolean getQa() {
        return isQa;
    }
}
