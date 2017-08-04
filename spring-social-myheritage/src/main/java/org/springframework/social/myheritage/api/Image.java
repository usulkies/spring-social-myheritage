package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Image extends MyHeritageObject{
    private final String url;
    private final Integer width;
    private final Integer height;
    private final String className;

    public Image(String url, Integer width, Integer height, String className) {
        super(className);
        this.url = url;
        this.width = width;
        this.height = height;
        this.className = className;
    }

    public String getUrl() {
        return url;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public String getClassName() {
        return className;
    }
}
