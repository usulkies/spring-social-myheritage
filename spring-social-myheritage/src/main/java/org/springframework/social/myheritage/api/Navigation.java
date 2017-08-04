package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class Navigation extends MyHeritageObject{

    private final String id;
    private final UserMenu userMenu;
    private final List<NavigationItem> header;
    private final List<NavigationItem> footer;


    public Navigation(String className, String id, UserMenu userMenu, List<NavigationItem> header, List<NavigationItem> footer) {
        super(className);
        this.id = id;
        this.userMenu = userMenu;
        this.header = header;
        this.footer = footer;
    }

    public String getId() {
        return id;
    }

    public UserMenu getUserMenu() {
        return userMenu;
    }

    public List<NavigationItem> getHeader() {
        return header;
    }

    public List<NavigationItem> getFooter() {
        return footer;
    }
}
