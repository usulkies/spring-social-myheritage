package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class DnaOrderItemShippingDetails extends MyHeritageObject {

    private final String id;
    private final String serialNumber;
    private final String shippingProvider;
    private final String shippingCarrier;
    private final Integer estimatedShippingBusinessDays;
    private final String trackingUrl;
    private final String trackingNumber;
    private final ShippingAddress shippingAddress;
    private OrderStatus status;
    private final LocalDateTime createdTime;
    private final LocalDateTime updatedTime;
    private final DnaKitEnumerations.DnaKitError labErrorCode;
    private final LocalDateTime expectedResultsMinDate;
    private final LocalDateTime expectedResultsMaxDate;
    private final LocalDateTime orderDate;
    private final LocalDateTime shippingDate;
    private final LocalDateTime labArrivalFate;
    private final LocalDateTime labExtractionDate;
    private final LocalDateTime labAnalysisDate;
    private final LocalDateTime labRawDataDate;

    public DnaOrderItemShippingDetails(String className, String id, String serialNumber, String shippingProvider, String shippingCarrier, Integer estimatedShippingBusinessDays, String trackingUrl, String trackingNumber, ShippingAddress shippingAddress, OrderStatus status, LocalDateTime createdTime, LocalDateTime updatedTime, DnaKitEnumerations.DnaKitError labErrorCode, LocalDateTime expectedResultsMinDate, LocalDateTime expectedResultsMaxDate, LocalDateTime orderDate, LocalDateTime shippingDate, LocalDateTime labArrivalFate, LocalDateTime labExtractionDate, LocalDateTime labAnalysisDate, LocalDateTime labRawDataDate) {
        super(className);
        this.id = id;
        this.serialNumber = serialNumber;
        this.shippingProvider = shippingProvider;
        this.shippingCarrier = shippingCarrier;
        this.estimatedShippingBusinessDays = estimatedShippingBusinessDays;
        this.trackingUrl = trackingUrl;
        this.trackingNumber = trackingNumber;
        this.shippingAddress = shippingAddress;
        this.status = status;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.labErrorCode = labErrorCode;
        this.expectedResultsMinDate = expectedResultsMinDate;
        this.expectedResultsMaxDate = expectedResultsMaxDate;
        this.orderDate = orderDate;
        this.shippingDate = shippingDate;
        this.labArrivalFate = labArrivalFate;
        this.labExtractionDate = labExtractionDate;
        this.labAnalysisDate = labAnalysisDate;
        this.labRawDataDate = labRawDataDate;
    }


    public String getId() {
        return id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getShippingProvider() {
        return shippingProvider;
    }

    public String getShippingCarrier() {
        return shippingCarrier;
    }

    public Integer getEstimatedShippingBusinessDays() {
        return estimatedShippingBusinessDays;
    }

    public String getTrackingUrl() {
        return trackingUrl;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public DnaKitEnumerations.DnaKitError getLabErrorCode() {
        return labErrorCode;
    }

    public LocalDateTime getExpectedResultsMinDate() {
        return expectedResultsMinDate;
    }

    public LocalDateTime getExpectedResultsMaxDate() {
        return expectedResultsMaxDate;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public LocalDateTime getShippingDate() {
        return shippingDate;
    }

    public LocalDateTime getLabArrivalFate() {
        return labArrivalFate;
    }

    public LocalDateTime getLabExtractionDate() {
        return labExtractionDate;
    }

    public LocalDateTime getLabAnalysisDate() {
        return labAnalysisDate;
    }

    public LocalDateTime getLabRawDataDate() {
        return labRawDataDate;
    }
}
