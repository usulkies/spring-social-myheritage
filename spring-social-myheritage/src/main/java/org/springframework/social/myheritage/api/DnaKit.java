package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class DnaKit extends MyHeritageObject{
    private final String id;
    private final String name;
    private final String nameHtml;
    private final String description;
    private final String descriptionHtml;
    private MyHeritageUser submitter;
    private MyHeritageUser member;
    private Individual individual;
    private Boolean consent;
    private final String source;
    private final String type;
    private List<DnaKitFile> files;
    private final Boolean shouldUseForMatching;
    private final DnaKitEnumerations.DnaKitStatus status;
    private final OrderStatus reportedOrderStatus;
    private final OrderStatus estimatedOrderStatus;
    private Integer activationStatus;
    private final DnaKitEnumerations.DnaKitError error;
    private String reportedGender;
    private final Boolean canUserDownload;
    private final String serialNumber;
    private final DnaOrderItemShippingDetails shippingDetails;
    private final LocalDateTime createdTime;
    private final LocalDateTime updatedTime;
    private final String introUrl;
    private final String introFacebookApi;
    private final String introTwitterApi;
    private final String introWhatsAppApi;
    private final MyHeritageUser sponsor;
    private final List<String> dnaEthnicityReportModels;
    private final LocalDateTime activationDate;
    private final LocalDateTime labArrivalDate;
    private final LocalDateTime labExtractionDate;
    private final LocalDateTime labAnalysisDate;
    private final LocalDateTime labRawDataDate;
    private final LocalDateTime expectedResultsMinDate;
    private final LocalDateTime expectedResultsMaxDate;
    private Boolean isPedigreeChartObfuscated;

    //Connections:
    private final List<DnaEthnicityReport> dnaEthnicityReports;

    public DnaKit(String id, String name, String nameHtml, String description, String descriptionHtml, MyHeritageUser submitter, MyHeritageUser member, Individual individual, Boolean consent, String source, String type, List<DnaKitFile> files, Boolean shouldUseForMatching, DnaKitEnumerations.DnaKitStatus status, OrderStatus reportedOrderStatus, OrderStatus estimatedOrderStatus, Integer activationStatus, DnaKitEnumerations.DnaKitError error, String reportedGender, Boolean canUserDownload, String serialNumber, DnaOrderItemShippingDetails shippingDetails, LocalDateTime createdTime, LocalDateTime updatedTime, String introUrl, String introFacebookApi, String introTwitterApi, String introWhatsAppApi, MyHeritageUser sponsor, List<String> dnaEthnicityReportModels, LocalDateTime activationDate, LocalDateTime labArrivalDate, LocalDateTime labExtractionDate, LocalDateTime labAnalysisDate, LocalDateTime labRawDataDate, LocalDateTime expectedResultsMinDate, LocalDateTime expectedResultsMaxDate, Boolean isPedigreeChartObfuscated, String className, List<DnaEthnicityReport> dnaEthnicityReports) {
        super(className);
        this.id = id;
        this.name = name;
        this.nameHtml = nameHtml;
        this.description = description;
        this.descriptionHtml = descriptionHtml;
        this.submitter = submitter;
        this.member = member;
        this.individual = individual;
        this.consent = consent;
        this.source = source;
        this.type = type;
        this.files = files;
        this.shouldUseForMatching = shouldUseForMatching;
        this.status = status;
        this.reportedOrderStatus = reportedOrderStatus;
        this.estimatedOrderStatus = estimatedOrderStatus;
        this.activationStatus = activationStatus;
        this.error = error;
        this.reportedGender = reportedGender;
        this.canUserDownload = canUserDownload;
        this.serialNumber = serialNumber;
        this.shippingDetails = shippingDetails;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.introUrl = introUrl;
        this.introFacebookApi = introFacebookApi;
        this.introTwitterApi = introTwitterApi;
        this.introWhatsAppApi = introWhatsAppApi;
        this.sponsor = sponsor;
        this.dnaEthnicityReportModels = dnaEthnicityReportModels;
        this.activationDate = activationDate;
        this.labArrivalDate = labArrivalDate;
        this.labExtractionDate = labExtractionDate;
        this.labAnalysisDate = labAnalysisDate;
        this.labRawDataDate = labRawDataDate;
        this.expectedResultsMinDate = expectedResultsMinDate;
        this.expectedResultsMaxDate = expectedResultsMaxDate;
        this.isPedigreeChartObfuscated = isPedigreeChartObfuscated;
        this.dnaEthnicityReports = dnaEthnicityReports;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNameHtml() {
        return nameHtml;
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public MyHeritageUser getSubmitter() {
        return submitter;
    }

    public void setSubmitter(MyHeritageUser submitter) {
        this.submitter = submitter;
    }

    public MyHeritageUser getMember() {
        return member;
    }

    public void setMember(MyHeritageUser member) {
        this.member = member;
    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public Boolean getConsent() {
        return consent;
    }

    public void setConsent(Boolean consent) {
        this.consent = consent;
    }

    public String getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    public List<DnaKitFile> getFiles() {
        return files;
    }

    public void setFiles(List<DnaKitFile> files) {
        this.files = files;
    }

    public Boolean getShouldUseForMatching() {
        return shouldUseForMatching;
    }

    public DnaKitEnumerations.DnaKitStatus getStatus() {
        return status;
    }

    public OrderStatus getReportedOrderStatus() {
        return reportedOrderStatus;
    }

    public OrderStatus getEstimatedOrderStatus() {
        return estimatedOrderStatus;
    }

    public Integer getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(Integer activationStatus) {
        this.activationStatus = activationStatus;
    }

    public DnaKitEnumerations.DnaKitError getError() {
        return error;
    }

    public String getReportedGender() {
        return reportedGender;
    }

    public void setReportedGender(String reportedGender) {
        this.reportedGender = reportedGender;
    }

    public Boolean getCanUserDownload() {
        return canUserDownload;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public DnaOrderItemShippingDetails getShippingDetails() {
        return shippingDetails;
    }
}
