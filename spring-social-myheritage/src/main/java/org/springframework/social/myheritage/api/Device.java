package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Device extends MyHeritageObject{
    private final String id;
    private String guid;
    private String osType;
    private String manufacturer;
    private String osVersion;
    private String resolution;
    private String pushGuid;
    private String language;
    List<Installation> installations;

    public Device(String id, String guid, String osType, String manufacturer, String osVersion, String resolution, String pushGuid, String language, String className) {
        super(className);
        this.id = id;
        this.guid = guid;
        this.osType = osType;
        this.manufacturer = manufacturer;
        this.osVersion = osVersion;
        this.resolution = resolution;
        this.pushGuid = pushGuid;
        this.language = language;
    }

    public String getId() {
        return id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getPushGuid() {
        return pushGuid;
    }

    public void setPushGuid(String pushGuid) {
        this.pushGuid = pushGuid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Installation> getInstallations() {
        return installations;
    }

    public void setInstallations(List<Installation> installations) {
        this.installations = installations;
    }
}
