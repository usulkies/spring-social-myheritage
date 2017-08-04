package org.springframework.social.myheritage.api;

import java.util.List;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class ResiEvent extends Event{

    private String email;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private String fax;
    private String phone;
    private String webAddress;
    private String webUsername;
    private String webType;
    private final String category;

    public ResiEvent(String className, String id, String eventType, String title, EventDate date, String place, String header, String age, String link, String dataLanguage, Individual individual, Tree tree, Site site, String causeOfDeath, String hairColor, String eyeColor, String height, String weight, String description, List<MediaItem> media, List<Citation> citations, List<Note> notes, String email, String address, String address2, String city, String state, String country, String zipCode, String fax, String phone, String webAddress, String webUsername, String webType, String category) {
        super(className, id, eventType, title, date, place, header, age, link, dataLanguage, individual, tree, site, causeOfDeath, hairColor, eyeColor, height, weight, description, media, citations, notes);
        this.email = email;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.fax = fax;
        this.phone = phone;
        this.webAddress = webAddress;
        this.webUsername = webUsername;
        this.webType = webType;
        this.category = category;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getWebUsername() {
        return webUsername;
    }

    public void setWebUsername(String webUsername) {
        this.webUsername = webUsername;
    }

    public String getWebType() {
        return webType;
    }

    public void setWebType(String webType) {
        this.webType = webType;
    }

    public String getCategory() {
        return category;
    }


}
