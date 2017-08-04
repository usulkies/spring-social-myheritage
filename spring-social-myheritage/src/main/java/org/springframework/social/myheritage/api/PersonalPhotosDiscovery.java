package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class PersonalPhotosDiscovery extends MyHeritageObject{

    private final String id;
    private final String link;
    private final Integer photoCount;
    private DiscoveryBase.DiscoveryStatus status;
    private final Integer score;
    private final Boolean isApplicable;
    private List<NewPhotoInfo>  newPhotos;
    private Tree tree;

    public PersonalPhotosDiscovery(String className, String id, String link, Integer photoCount, DiscoveryBase.DiscoveryStatus status, Integer score, Boolean isApplicable, List<NewPhotoInfo> newPhotos, Tree tree) {
        super(className);
        this.id = id;
        this.link = link;
        this.photoCount = photoCount;
        this.status = status;
        this.score = score;
        this.isApplicable = isApplicable;
        this.newPhotos = newPhotos;
        this.tree = tree;
    }

    public String getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public Integer getPhotoCount() {
        return photoCount;
    }

    public DiscoveryBase.DiscoveryStatus getStatus() {
        return status;
    }

    public void setStatus(DiscoveryBase.DiscoveryStatus status) {
        this.status = status;
    }

    public Integer getScore() {
        return score;
    }

    public Boolean getApplicable() {
        return isApplicable;
    }

    public List<NewPhotoInfo> getNewPhotos() {
        return newPhotos;
    }

    public void setNewPhotos(List<NewPhotoInfo> newPhotos) {
        this.newPhotos = newPhotos;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }
}
