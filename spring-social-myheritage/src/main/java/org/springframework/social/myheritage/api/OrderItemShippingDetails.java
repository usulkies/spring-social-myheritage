package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.time.LocalDateTime;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class OrderItemShippingDetails extends MyHeritageObject{

    private final String id;
    private final String serialNumber;
    private final String shippingProvider;
    private final String shippingCarrier;
    private final Integer estimatedShippingBusinessDays;
    private final String trackingUrl;
    private final String trackingNumber;
    private final ShippingAddress shippingAddress;
    private final OrderStatus status;
    private final LocalDateTime createdTime;
    private final LocalDateTime updatedTime;

    public OrderItemShippingDetails(String className, String id, String serialNumber, String shippingProvider, String shippingCarrier, Integer estimatedShippingBusinessDays, String trackingUrl, String trackingNumber, ShippingAddress shippingAddress, OrderStatus status, LocalDateTime createdTime, LocalDateTime updatedTime) {
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

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }
}
