package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class ShippingAddress extends MyHeritageObject{
    private String fromFirstName;
    private String fromLastName;
    private String toFirstName;
    private String toLastName;
    private String address;
    private String city;
    private String stateOrDistinct;
    private String countryCode;
    private String country;
    private String zipCode;

    public ShippingAddress(String className, String fromFirstName, String fromLastName, String toFirstName, String toLastName, String address, String city, String stateOrDistinct, String countryCode, String country) {
        super(className);
        this.fromFirstName = fromFirstName;
        this.fromLastName = fromLastName;
        this.toFirstName = toFirstName;
        this.toLastName = toLastName;
        this.address = address;
        this.city = city;
        this.stateOrDistinct = stateOrDistinct;
        this.countryCode = countryCode;
        this.country = country;
    }

    public String getFromFirstName() {
        return fromFirstName;
    }

    public void setFromFirstName(String fromFirstName) {
        this.fromFirstName = fromFirstName;
    }

    public String getFromLastName() {
        return fromLastName;
    }

    public void setFromLastName(String fromLastName) {
        this.fromLastName = fromLastName;
    }

    public String getToFirstName() {
        return toFirstName;
    }

    public void setToFirstName(String toFirstName) {
        this.toFirstName = toFirstName;
    }

    public String getToLastName() {
        return toLastName;
    }

    public void setToLastName(String toLastName) {
        this.toLastName = toLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrDistinct() {
        return stateOrDistinct;
    }

    public void setStateOrDistinct(String stateOrDistinct) {
        this.stateOrDistinct = stateOrDistinct;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
