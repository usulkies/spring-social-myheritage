package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class Phones extends MyHeritageObject{

    private String homePhone;
    private List<String> workPhone;
    private String mobilePhone;
    private String homeFax;
    private String workFax;

    public Phones(String className, String homePhone, List<String> workPhone, String mobilePhone, String homeFax, String workFax) {
        super(className);
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.mobilePhone = mobilePhone;
        this.homeFax = homeFax;
        this.workFax = workFax;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public List<String> getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(List<String> workPhone) {
        this.workPhone = workPhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomeFax() {
        return homeFax;
    }

    public void setHomeFax(String homeFax) {
        this.homeFax = homeFax;
    }

    public String getWorkFax() {
        return workFax;
    }

    public void setWorkFax(String workFax) {
        this.workFax = workFax;
    }
}
