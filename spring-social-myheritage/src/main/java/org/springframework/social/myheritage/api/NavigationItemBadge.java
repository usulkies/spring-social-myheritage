package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class NavigationItemBadge extends MyHeritageObject {

    public enum BadgeType {NEW, UPDATED}

    private final String text;
    private final BadgeType type;


    public NavigationItemBadge(String className, String text, BadgeType type) {
        super(className);
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public BadgeType getType() {
        return type;
    }
}
