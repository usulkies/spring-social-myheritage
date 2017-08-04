package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class Counter extends MyHeritageObject{

    public final String id;
    public final String name;
    public final Integer value;

    public Counter(String className, String id, String name, Integer value) {
        super(className);
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }
}
