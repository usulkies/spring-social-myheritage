package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Invitation extends MyHeritageObject {
    public enum Channel {EMAIL, SMS}
    public enum Platform {WEB, iOS, ANDROID}
    public enum InvitationStatus {PENDING, APPROVED, REINVITE, SENT, FAILED}
    public enum InvitationSource {MOBILE_INVITATION_CENTER, MOBILE_PROFILE, INCENTIVIZER, CONTACT_IMPORTER, DATA_ENTRY, FTB, INSTANT, GREETINGS, EDIT_TAG, REMIND}
    private final String id;
    private Channel channel;
    private Platform platform;
    private String contactMeans;
    private final Site site;
    private final MyHeritageUser inviter;
    private final LocalDateTime creationTime;
    private final InvitationStatus status;
    private LocalDateTime statusTime;
    private MyHeritageUser invitee;
    private Individual inviteeIndividual;
    private final Integer reinviteCount;
    private final Boolean visited;
    private InvitationSource source;


    public Invitation(String className, String id, Channel channel, Platform platform, String contactMeans, Site site, MyHeritageUser inviter, LocalDateTime creationTime, InvitationStatus status, LocalDateTime statusTime, MyHeritageUser invitee, Individual inviteeIndividual, Integer reinviteCount, Boolean visited, InvitationSource source) {
        super(className);
        this.id = id;
        this.channel = channel;
        this.platform = platform;
        this.contactMeans = contactMeans;
        this.site = site;
        this.inviter = inviter;
        this.creationTime = creationTime;
        this.status = status;
        this.statusTime = statusTime;
        this.invitee = invitee;
        this.inviteeIndividual = inviteeIndividual;
        this.reinviteCount = reinviteCount;
        this.visited = visited;
        this.source = source;
    }


    public String getId() {
        return id;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getContactMeans() {
        return contactMeans;
    }

    public void setContactMeans(String contactMeans) {
        this.contactMeans = contactMeans;
    }

    public Site getSite() {
        return site;
    }

    public MyHeritageUser getInviter() {
        return inviter;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public InvitationStatus getStatus() {
        return status;
    }

    public LocalDateTime getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(LocalDateTime statusTime) {
        this.statusTime = statusTime;
    }

    public MyHeritageUser getInvitee() {
        return invitee;
    }

    public void setInvitee(MyHeritageUser invitee) {
        this.invitee = invitee;
    }

    public Individual getInviteeIndividual() {
        return inviteeIndividual;
    }

    public void setInviteeIndividual(Individual inviteeIndividual) {
        this.inviteeIndividual = inviteeIndividual;
    }

    public Integer getReinviteCount() {
        return reinviteCount;
    }

    public Boolean getVisited() {
        return visited;
    }

    public InvitationSource getSource() {
        return source;
    }

    public void setSource(InvitationSource source) {
        this.source = source;
    }
}
