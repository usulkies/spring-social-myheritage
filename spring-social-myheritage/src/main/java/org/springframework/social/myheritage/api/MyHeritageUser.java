package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;
import sun.reflect.generics.tree.Tree;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class MyHeritageUser extends MyHeritageObject {


    public enum AgeGroup {
        ADULT, CHILD
    }
    private final String id;
    private final String name;
    private final String email;
    private final String firstName;
    private final String lastName;
    private String nickname;
    private final String gender;
    private final String preferredDisplayLanguage;
    private final String preferredEmailLanguage;
    private final String link;
    private final EventDate birthDate;
    private final String address;
    private final String address2;
    private final String city;
    private final String countryCode;
    private final String country;
    private final String stateOrDistinct;
    private final String zipCode;
    private final LocalDateTime createdTime;
    private final LocalDateTime lastVisitTime;
    private final Boolean isPublic;
    private final Boolean showAge;
    private final Boolean allowPostingComments;
    private final Boolean notifyOnComments;
    private Boolean showRealName;
    private Photo personalPhoto;
    private final Site defaultSite;
    private final Tree defaultTree;
    private final Individual defaultIndividual;
    private final MailBox mailBox;
    private Phones phones;
    private AgeGroup ageGroup;
    private String ageGroupInYears;
    private final Suggestions suggestions;
    private final String className;

    //Connections
    private final List<Membership> memberships;
    private List<Photo> picture;
    private List<Device> devices;
    private List<DnaKit> dnaKits;
    private List<DnaMatch> dnaMatches;
    private List<NotificationSetting> notificationSettings;

    public MyHeritageUser(String className, String id, String name, String email, String firstName, String lastName, String nickname, String gender, String preferredDisplayLanguage, String preferredEmailLanguage, String link, EventDate birthDate, String address, String address2, String city, String countryCode, String country, String stateOrDistinct, String zipCode, LocalDateTime createdTime, LocalDateTime lastVisitTime, Boolean isPublic, Boolean showAge, Boolean allowPostingComments, Boolean notifyOnComments, Boolean showRealName, Photo personalPhoto, Site defaultSite, Tree defaultTree, Individual defaultIndividual, MailBox mailBox, Phones phones, AgeGroup ageGroup, String ageGroupInYears, Suggestions suggestions, String className1, List<Membership> memberships, List<Photo> picture, List<Device> devices, List<DnaKit> dnaKits, List<DnaMatch> dnaMatches, List<NotificationSetting> notificationSettings) {
        super(className);
        this.id = id;
        this.name = name;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.gender = gender;
        this.preferredDisplayLanguage = preferredDisplayLanguage;
        this.preferredEmailLanguage = preferredEmailLanguage;
        this.link = link;
        this.birthDate = birthDate;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.countryCode = countryCode;
        this.country = country;
        this.stateOrDistinct = stateOrDistinct;
        this.zipCode = zipCode;
        this.createdTime = createdTime;
        this.lastVisitTime = lastVisitTime;
        this.isPublic = isPublic;
        this.showAge = showAge;
        this.allowPostingComments = allowPostingComments;
        this.notifyOnComments = notifyOnComments;
        this.showRealName = showRealName;
        this.personalPhoto = personalPhoto;
        this.defaultSite = defaultSite;
        this.defaultTree = defaultTree;
        this.defaultIndividual = defaultIndividual;
        this.mailBox = mailBox;
        this.phones = phones;
        this.ageGroup = ageGroup;
        this.ageGroupInYears = ageGroupInYears;
        this.suggestions = suggestions;
        this.className = className1;
        this.memberships = memberships;
        this.picture = picture;
        this.devices = devices;
        this.dnaKits = dnaKits;
        this.dnaMatches = dnaMatches;
        this.notificationSettings = notificationSettings;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public String getPreferredDisplayLanguage() {
        return preferredDisplayLanguage;
    }

    public String getPreferredEmailLanguage() {
        return preferredEmailLanguage;
    }

    public String getLink() {
        return link;
    }

    public EventDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountry() {
        return country;
    }

    public String getStateOrDistinct() {
        return stateOrDistinct;
    }

    public String getZipCode() {
        return zipCode;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public LocalDateTime getLastVisitTime() {
        return lastVisitTime;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public Boolean getShowAge() {
        return showAge;
    }

    public Boolean getAllowPostingComments() {
        return allowPostingComments;
    }

    public Boolean getNotifyOnComments() {
        return notifyOnComments;
    }

    public Boolean getShowRealName() {
        return showRealName;
    }

    public void setShowRealName(Boolean showRealName) {
        this.showRealName = showRealName;
    }

    public Photo getPersonalPhoto() {
        return personalPhoto;
    }

    public void setPersonalPhoto(Photo personalPhoto) {
        this.personalPhoto = personalPhoto;
    }

    public Site getDefaultSite() {
        return defaultSite;
    }

    public Tree getDefaultTree() {
        return defaultTree;
    }

    public Individual getDefaultIndividual() {
        return defaultIndividual;
    }

    public MailBox getMailBox() {
        return mailBox;
    }

    public Phones getPhones() {
        return phones;
    }

    public void setPhones(Phones phones) {
        this.phones = phones;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getAgeGroupInYears() {
        return ageGroupInYears;
    }

    public void setAgeGroupInYears(String ageGroupInYears) {
        this.ageGroupInYears = ageGroupInYears;
    }

    public Suggestions getSuggestions() {
        return suggestions;
    }

    @Override
    public String getClassName() {
        return className;
    }

    public List<Membership> getMemberships() {
        return memberships;
    }

    public List<Photo> getPicture() {
        return picture;
    }

    public void setPicture(List<Photo> picture) {
        this.picture = picture;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<DnaKit> getDnaKits() {
        return dnaKits;
    }

    public void setDnaKits(List<DnaKit> dnaKits) {
        this.dnaKits = dnaKits;
    }

    public List<DnaMatch> getDnaMatches() {
        return dnaMatches;
    }

    public void setDnaMatches(List<DnaMatch> dnaMatches) {
        this.dnaMatches = dnaMatches;
    }

    public List<NotificationSetting> getNotificationSettings() {
        return notificationSettings;
    }

    public void setNotificationSettings(List<NotificationSetting> notificationSettings) {
        this.notificationSettings = notificationSettings;
    }
}
