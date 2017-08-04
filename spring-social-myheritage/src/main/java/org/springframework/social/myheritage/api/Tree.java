package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Tree extends MyHeritageObject{

    public enum TreeSource {WEB, FTB, GEDCOM}
    private final String id;
    private String name;
    private final Site site;
    private final String link;
    private final List<String> dataLanguages;
    private final LocalDateTime updatedTime;
    private final TreeSource treeSource;
    private Individual rootIndividual;
    private Boolean isPublic;
    private final Integer individualCount;
    private final Boolean allowDownloadBySiteMembers;
    private final Boolean allowDownloadByNonSiteMembers;
    private final Boolean isSmartMatchingEnabled;
    private Boolean allowSmartMatchingOnLivingPepole;
    private final Boolean allowGrabbingPhotos;
    private final MatchesCount matchesCount;
    private final List<Counter> individualsWithMatchesCount;
    private final Integer discoveriesCount;
    private final Integer matchesLatestMarker;
    private final Boolean isAutoPublished;
    private final String projectGuid;
    private final Boolean canEdit;

    //Connections
    private final List<Individual> individuals;
    private final List<RecordMatchesCount> recordMatchesCounts;
    private final List<Source> sources;
    private final ExportGEDCOM exportGedcom;
    private final List<DiscoveryBase> discoveries;

    public Tree(String className, String id, String name, Site site, String link, List<String> dataLanguages, LocalDateTime updatedTime, TreeSource treeSource, Individual rootIndividual, Boolean isPublic, Integer individualCount, Boolean allowDownloadBySiteMembers, Boolean allowDownloadByNonSiteMembers, Boolean isSmartMatchingEnabled, Boolean allowSmartMatchingOnLivingPepole, Boolean allowGrabbingPhotos, MatchesCount matchesCount, List<Counter> individualsWithMatchesCount, Integer discoveriesCount, Integer matchesLatestMarker, Boolean isAutoPublished, String projectGuid, Boolean canEdit, List<Individual> individuals, List<RecordMatchesCount> recordMatchesCounts, List<Source> sources, ExportGEDCOM exportGedcom, List<DiscoveryBase> discoveries) {
        super(className);
        this.id = id;
        this.name = name;
        this.site = site;
        this.link = link;
        this.dataLanguages = dataLanguages;
        this.updatedTime = updatedTime;
        this.treeSource = treeSource;
        this.rootIndividual = rootIndividual;
        this.isPublic = isPublic;
        this.individualCount = individualCount;
        this.allowDownloadBySiteMembers = allowDownloadBySiteMembers;
        this.allowDownloadByNonSiteMembers = allowDownloadByNonSiteMembers;
        this.isSmartMatchingEnabled = isSmartMatchingEnabled;
        this.allowSmartMatchingOnLivingPepole = allowSmartMatchingOnLivingPepole;
        this.allowGrabbingPhotos = allowGrabbingPhotos;
        this.matchesCount = matchesCount;
        this.individualsWithMatchesCount = individualsWithMatchesCount;
        this.discoveriesCount = discoveriesCount;
        this.matchesLatestMarker = matchesLatestMarker;
        this.isAutoPublished = isAutoPublished;
        this.projectGuid = projectGuid;
        this.canEdit = canEdit;
        this.individuals = individuals;
        this.recordMatchesCounts = recordMatchesCounts;
        this.sources = sources;
        this.exportGedcom = exportGedcom;
        this.discoveries = discoveries;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Site getSite() {
        return site;
    }

    public String getLink() {
        return link;
    }

    public List<String> getDataLanguages() {
        return dataLanguages;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public TreeSource getTreeSource() {
        return treeSource;
    }

    public Individual getRootIndividual() {
        return rootIndividual;
    }

    public void setRootIndividual(Individual rootIndividual) {
        this.rootIndividual = rootIndividual;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public Integer getIndividualCount() {
        return individualCount;
    }

    public Boolean getAllowDownloadBySiteMembers() {
        return allowDownloadBySiteMembers;
    }

    public Boolean getAllowDownloadByNonSiteMembers() {
        return allowDownloadByNonSiteMembers;
    }

    public Boolean getSmartMatchingEnabled() {
        return isSmartMatchingEnabled;
    }

    public Boolean getAllowSmartMatchingOnLivingPepole() {
        return allowSmartMatchingOnLivingPepole;
    }

    public void setAllowSmartMatchingOnLivingPepole(Boolean allowSmartMatchingOnLivingPepole) {
        this.allowSmartMatchingOnLivingPepole = allowSmartMatchingOnLivingPepole;
    }

    public Boolean getAllowGrabbingPhotos() {
        return allowGrabbingPhotos;
    }

    public MatchesCount getMatchesCount() {
        return matchesCount;
    }

    public List<Counter> getIndividualsWithMatchesCount() {
        return individualsWithMatchesCount;
    }

    public Integer getDiscoveriesCount() {
        return discoveriesCount;
    }

    public Integer getMatchesLatestMarker() {
        return matchesLatestMarker;
    }

    public Boolean getAutoPublished() {
        return isAutoPublished;
    }

    public String getProjectGuid() {
        return projectGuid;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public List<Individual> getIndividuals() {
        return individuals;
    }

    public List<RecordMatchesCount> getRecordMatchesCounts() {
        return recordMatchesCounts;
    }

    public List<Source> getSources() {
        return sources;
    }

    public ExportGEDCOM getExportGedcom() {
        return exportGedcom;
    }

    public List<DiscoveryBase> getDiscoveries() {
        return discoveries;
    }
}
