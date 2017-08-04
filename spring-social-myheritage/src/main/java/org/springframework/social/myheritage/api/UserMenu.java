package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class UserMenu extends MyHeritageObject{
    private final String id;
    private final List<NavigationItem> links;

    public UserMenu(String className, String id, List<NavigationItem> links) {
        super(className);
        this.id = id;
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public List<NavigationItem> getLinks() {
        return links;
    }
}
