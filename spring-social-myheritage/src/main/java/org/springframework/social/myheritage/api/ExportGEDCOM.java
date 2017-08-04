package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class ExportGEDCOM extends MyHeritageObject{

    private final String handle;
    private final Site site;
    private final Tree tree;

    public ExportGEDCOM(String className, String handle, Site site, Tree tree) {
        super(className);
        this.handle = handle;
        this.site = site;
        this.tree = tree;
    }

    public String getHandle() {
        return handle;
    }

    public Site getSite() {
        return site;
    }

    public Tree getTree() {
        return tree;
    }
}
