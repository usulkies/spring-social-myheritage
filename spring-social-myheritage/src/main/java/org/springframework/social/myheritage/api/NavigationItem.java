package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 04/08/2017.
 */
public class NavigationItem extends MyHeritageObject{

    private final String text;
    private final String url;
    private final String imageUrl;
    private final NavigationItemBadge badge;
    private final List<NavigationItem> subMenuItems;


    public NavigationItem(String className, String text, String url, String imageUrl, NavigationItemBadge badge, List<NavigationItem> subMenuItems) {
        super(className);
        this.text = text;
        this.url = url;
        this.imageUrl = imageUrl;
        this.badge = badge;
        this.subMenuItems = subMenuItems;
    }


    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public NavigationItemBadge getBadge() {
        return badge;
    }

    public List<NavigationItem> getSubMenuItems() {
        return subMenuItems;
    }
}
