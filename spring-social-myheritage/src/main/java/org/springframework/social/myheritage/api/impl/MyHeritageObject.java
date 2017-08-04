package org.springframework.social.myheritage.api.impl;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public abstract class MyHeritageObject {
    protected final String className;
    private Map<String, Object> extraData;

    public MyHeritageObject(String className) {
        this.className = className;
        this.extraData = new HashMap<>();
    }

    /**
     * @return Any fields in response from MyHeritage that are otherwise not mapped to any properties.
     */
    public Map<String, Object> getExtraData() {
        return extraData;
    }

    /**
     * {@link JsonAnySetter} hook. Called when an otherwise unmapped property is being processed during JSON deserialization.
     * @param key The property's key.
     * @param value The property's value.
     */
    protected void add(String key, Object value) {
        extraData.put(key, value);
    }

    public String getClassName() {
        return className;
    }

}
