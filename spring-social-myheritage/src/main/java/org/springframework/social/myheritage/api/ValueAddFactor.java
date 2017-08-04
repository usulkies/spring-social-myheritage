package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class ValueAddFactor extends MyHeritageObject {
    private final String name;
    private final String modifier;
    private final String group;
    private final String className;

    public ValueAddFactor(String className, String name, String modifier, String group, String className1) {
        super(className);
        this.name = name;
        this.modifier = modifier;
        this.group = group;
        this.className = className1;
    }

    public String getName() {
        return name;
    }

    public String getModifier() {
        return modifier;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String getClassName() {
        return className;
    }
}
