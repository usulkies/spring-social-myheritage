package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Site extends MyHeritageObject {
    private final String id;
    private final String name;
    private final String description;
    private final String subDomain;
    private final String link;
    private final SitePlan plan;
    private final SitePrivacyPolicy privacyPolicy;
    private final MediaItem siteLogo;
    private final MyHeritageUser creator;
    private final LocalDateTime createdDate;
    private final LocalDateTime planExpiryDate;
    private final Tree defaultTree;
    private final Individual defaultRootIndividual;
    private final Integer memberCount;
    private final Integer albumCount;
    private final Integer mediaCount;
    private final Integer treeCount;
    private final Boolean isListedInSiteCenter;
    private final Boolean canMembersEditTrees;
    private final Boolean canMembersPostContent;
    private final Boolean canMemberManageMedia;
    private final Boolean isRequestMembershipAllowed;
    private final Boolean canMembersInviteOtherMembers;
    private final Boolean isSiteOpenedForGuests;
    private final Boolean notifyManagersOnMembershipRequest;
    private final Boolean isInDiscoveriesCooloff;
    private final List<MatchesCount> matchesCount;
    private final String className;

    //Conections
    private final List<Membership> memberships;
    private List<Tree> trees;
    private List<Album> albums;
    private List<Invitation> invitations;
    private List<MediaItem> media;

    public Site(String className, String id, String name, String description, String subDomain, String link, SitePlan plan, SitePrivacyPolicy privacyPolicy, MediaItem siteLogo, MyHeritageUser creator, LocalDateTime createdDate, LocalDateTime planExpiryDate, Tree defaultTree, Individual defaultRootIndividual, Integer memberCount, Integer albumCount, Integer mediaCount, Integer treeCount, Boolean isListedInSiteCenter, Boolean canMembersEditTrees, Boolean canMembersPostContent, Boolean canMemberManageMedia, Boolean isRequestMembershipAllowed, Boolean canMembersInviteOtherMembers, Boolean isSiteOpenedForGuests, Boolean notifyManagersOnMembershipRequest, Boolean isInDiscoveriesCooloff, List<MatchesCount> matchesCount, String className1, List<Membership> memberships, List<Tree> trees, List<Album> albums, List<Invitation> invitations, List<MediaItem> media) {
        super(className);
        this.id = id;
        this.name = name;
        this.description = description;
        this.subDomain = subDomain;
        this.link = link;
        this.plan = plan;
        this.privacyPolicy = privacyPolicy;
        this.siteLogo = siteLogo;
        this.creator = creator;
        this.createdDate = createdDate;
        this.planExpiryDate = planExpiryDate;
        this.defaultTree = defaultTree;
        this.defaultRootIndividual = defaultRootIndividual;
        this.memberCount = memberCount;
        this.albumCount = albumCount;
        this.mediaCount = mediaCount;
        this.treeCount = treeCount;
        this.isListedInSiteCenter = isListedInSiteCenter;
        this.canMembersEditTrees = canMembersEditTrees;
        this.canMembersPostContent = canMembersPostContent;
        this.canMemberManageMedia = canMemberManageMedia;
        this.isRequestMembershipAllowed = isRequestMembershipAllowed;
        this.canMembersInviteOtherMembers = canMembersInviteOtherMembers;
        this.isSiteOpenedForGuests = isSiteOpenedForGuests;
        this.notifyManagersOnMembershipRequest = notifyManagersOnMembershipRequest;
        this.isInDiscoveriesCooloff = isInDiscoveriesCooloff;
        this.matchesCount = matchesCount;
        this.className = className1;
        this.memberships = memberships;
        this.trees = trees;
        this.albums = albums;
        this.invitations = invitations;
        this.media = media;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSubDomain() {
        return subDomain;
    }

    public String getLink() {
        return link;
    }

    public SitePlan getPlan() {
        return plan;
    }

    public SitePrivacyPolicy getPrivacyPolicy() {
        return privacyPolicy;
    }

    public MediaItem getSiteLogo() {
        return siteLogo;
    }

    public MyHeritageUser getCreator() {
        return creator;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getPlanExpiryDate() {
        return planExpiryDate;
    }

    public Tree getDefaultTree() {
        return defaultTree;
    }

    public Individual getDefaultRootIndividual() {
        return defaultRootIndividual;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public Integer getAlbumCount() {
        return albumCount;
    }

    public Integer getMediaCount() {
        return mediaCount;
    }

    public Integer getTreeCount() {
        return treeCount;
    }

    public Boolean getListedInSiteCenter() {
        return isListedInSiteCenter;
    }

    public Boolean getCanMembersEditTrees() {
        return canMembersEditTrees;
    }

    public Boolean getCanMembersPostContent() {
        return canMembersPostContent;
    }

    public Boolean getCanMemberManageMedia() {
        return canMemberManageMedia;
    }

    public Boolean getRequestMembershipAllowed() {
        return isRequestMembershipAllowed;
    }

    public Boolean getCanMembersInviteOtherMembers() {
        return canMembersInviteOtherMembers;
    }

    public Boolean getSiteOpenedForGuests() {
        return isSiteOpenedForGuests;
    }

    public Boolean getNotifyManagersOnMembershipRequest() {
        return notifyManagersOnMembershipRequest;
    }

    public Boolean getInDiscoveriesCooloff() {
        return isInDiscoveriesCooloff;
    }

    public List<MatchesCount> getMatchesCount() {
        return matchesCount;
    }

    @Override
    public String getClassName() {
        return className;
    }

    public List<Membership> getMemberships() {
        return memberships;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public void setTrees(List<Tree> trees) {
        this.trees = trees;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Invitation> getInvitations() {
        return invitations;
    }

    public void setInvitations(List<Invitation> invitations) {
        this.invitations = invitations;
    }

    public List<MediaItem> getMedia() {
        return media;
    }

    public void setMedia(List<MediaItem> media) {
        this.media = media;
    }

    public enum SitePlan {
        BASIC, PREMIUM, PREMIUM_PLUS
    }
    public enum SitePrivacyPolicy {
        PUBLIC, MIXED, PRIVATE
    }
}
