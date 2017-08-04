package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Individual extends MyHeritageObject{

    private final String id;
    private final String name;
    private Boolean isAlive;
    private String firstName;
    private String lastName;
    private String formerName;
    private String maidenName;
    private String gender;
    private String namePrefix;
    private String nameSuffix;
    private final String nickname;
    private final String religiousName;
    private String marriedSurname;
    private final String aliasName;
    private EventDate birthDate;
    private String birthPlace;
    private EventDate deathDate;
    private final Relationship relationship;
    private final List<String> emails;
    private final Boolean isPrivatized;
    private final String link;
    private final String linkInTree;
    private List<Family> spouseInFamilies;
    private List<ChildInFamily> childInFamilies;
    private final Integer smartmatchCount;
    private final String dataLanguage;
    private Photo personalPhoto;
    private final Membership membership;
    private Tree tree;
    private Site site;
    private final MatchesCount matchesCount;
    private final MyHeritageUser.AgeGroup ageGroup;
    private final String ageGroupInYears;
    private final String personalPhotosLink;
    private final Integer mediaCount;
    private Boolean ignoreMatches;

    //Connections:
    private List<Relationship> immediateFamily;
    private List<Relationship> closeFamily;
    private List<Event> events;
    private List<ChildInFamily> child_in_families_connection;
    private List<Family> spouse_in_families_connection;
    private List<Tag> tags;
    private List<MediaItem> media;
    private List<Citation> citations;
    private List<Note> notes;
    private List<SmartMatch> smartMatches;
    private List<DnaKit> dnaKits;
    private List<DnaMatch> dnaMatches;
    private List<Invitation> invitations;

    public Individual(String className, String id, String name, Boolean isAlive, String firstName, String lastName, String formerName, String maidenName, String gender, String namePrefix, String nameSuffix, String nickname, String religiousName, String marriedSurname, String aliasName, EventDate birthDate, String birthPlace, EventDate deathDate, Relationship relationship, List<String> emails, Boolean isPrivatized, String link, String linkInTree, List<Family> spouseInFamilies, List<ChildInFamily> childInFamilies, Integer smartmatchCount, String dataLanguage, Photo personalPhoto, Membership membership, Tree tree, Site site, MatchesCount matchesCount, MyHeritageUser.AgeGroup ageGroup, String ageGroupInYears, String personalPhotosLink, Integer mediaCount, Boolean ignoreMatches, List<Relationship> immediateFamily, List<Relationship> closeFamily, List<Event> events, List<ChildInFamily> child_in_families_connection, List<Family> spouse_in_families_connection, List<Tag> tags, List<MediaItem> media, List<Citation> citations, List<Note> notes, List<SmartMatch> smartMatches, List<DnaKit> dnaKits, List<DnaMatch> dnaMatches, List<Invitation> invitations) {
        super(className);
        this.id = id;
        this.name = name;
        this.isAlive = isAlive;
        this.firstName = firstName;
        this.lastName = lastName;
        this.formerName = formerName;
        this.maidenName = maidenName;
        this.gender = gender;
        this.namePrefix = namePrefix;
        this.nameSuffix = nameSuffix;
        this.nickname = nickname;
        this.religiousName = religiousName;
        this.marriedSurname = marriedSurname;
        this.aliasName = aliasName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.deathDate = deathDate;
        this.relationship = relationship;
        this.emails = emails;
        this.isPrivatized = isPrivatized;
        this.link = link;
        this.linkInTree = linkInTree;
        this.spouseInFamilies = spouseInFamilies;
        this.childInFamilies = childInFamilies;
        this.smartmatchCount = smartmatchCount;
        this.dataLanguage = dataLanguage;
        this.personalPhoto = personalPhoto;
        this.membership = membership;
        this.tree = tree;
        this.site = site;
        this.matchesCount = matchesCount;
        this.ageGroup = ageGroup;
        this.ageGroupInYears = ageGroupInYears;
        this.personalPhotosLink = personalPhotosLink;
        this.mediaCount = mediaCount;
        this.ignoreMatches = ignoreMatches;
        this.immediateFamily = immediateFamily;
        this.closeFamily = closeFamily;
        this.events = events;
        this.child_in_families_connection = child_in_families_connection;
        this.spouse_in_families_connection = spouse_in_families_connection;
        this.tags = tags;
        this.media = media;
        this.citations = citations;
        this.notes = notes;
        this.smartMatches = smartMatches;
        this.dnaKits = dnaKits;
        this.dnaMatches = dnaMatches;
        this.invitations = invitations;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public String getNickname() {
        return nickname;
    }

    public String getReligiousName() {
        return religiousName;
    }

    public String getMarriedSurname() {
        return marriedSurname;
    }

    public void setMarriedSurname(String marriedSurname) {
        this.marriedSurname = marriedSurname;
    }

    public String getAliasName() {
        return aliasName;
    }

    public EventDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(EventDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public EventDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(EventDate deathDate) {
        this.deathDate = deathDate;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public List<String> getEmails() {
        return emails;
    }

    public Boolean getPrivatized() {
        return isPrivatized;
    }

    public String getLink() {
        return link;
    }

    public String getLinkInTree() {
        return linkInTree;
    }

    public List<Family> getSpouseInFamilies() {
        return spouseInFamilies;
    }

    public void setSpouseInFamilies(List<Family> spouseInFamilies) {
        this.spouseInFamilies = spouseInFamilies;
    }

    public List<ChildInFamily> getChildInFamilies() {
        return childInFamilies;
    }

    public void setChildInFamilies(List<ChildInFamily> childInFamilies) {
        this.childInFamilies = childInFamilies;
    }

    public Integer getSmartmatchCount() {
        return smartmatchCount;
    }

    public String getDataLanguage() {
        return dataLanguage;
    }

    public Photo getPersonalPhoto() {
        return personalPhoto;
    }

    public void setPersonalPhoto(Photo personalPhoto) {
        this.personalPhoto = personalPhoto;
    }

    public Membership getMembership() {
        return membership;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public MatchesCount getMatchesCount() {
        return matchesCount;
    }

    public MyHeritageUser.AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public String getAgeGroupInYears() {
        return ageGroupInYears;
    }

    public String getPersonalPhotosLink() {
        return personalPhotosLink;
    }

    public Integer getMediaCount() {
        return mediaCount;
    }

    public Boolean getIgnoreMatches() {
        return ignoreMatches;
    }

    public void setIgnoreMatches(Boolean ignoreMatches) {
        this.ignoreMatches = ignoreMatches;
    }

    public List<Relationship> getImmediateFamily() {
        return immediateFamily;
    }

    public void setImmediateFamily(List<Relationship> immediateFamily) {
        this.immediateFamily = immediateFamily;
    }

    public List<Relationship> getCloseFamily() {
        return closeFamily;
    }

    public void setCloseFamily(List<Relationship> closeFamily) {
        this.closeFamily = closeFamily;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<ChildInFamily> getChild_in_families_connection() {
        return child_in_families_connection;
    }

    public void setChild_in_families_connection(List<ChildInFamily> child_in_families_connection) {
        this.child_in_families_connection = child_in_families_connection;
    }

    public List<Family> getSpouse_in_families_connection() {
        return spouse_in_families_connection;
    }

    public void setSpouse_in_families_connection(List<Family> spouse_in_families_connection) {
        this.spouse_in_families_connection = spouse_in_families_connection;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<MediaItem> getMedia() {
        return media;
    }

    public void setMedia(List<MediaItem> media) {
        this.media = media;
    }

    public List<Citation> getCitations() {
        return citations;
    }

    public void setCitations(List<Citation> citations) {
        this.citations = citations;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<SmartMatch> getSmartMatches() {
        return smartMatches;
    }

    public void setSmartMatches(List<SmartMatch> smartMatches) {
        this.smartMatches = smartMatches;
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

    public List<Invitation> getInvitations() {
        return invitations;
    }

    public void setInvitations(List<Invitation> invitations) {
        this.invitations = invitations;
    }
}
