package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class DnaEthnicityReport extends MyHeritageObject{
    private final String id;
    private final List<DnaEthnicity> reports;
    private final String ethnicityVersion;


    public DnaEthnicityReport(String id, List<DnaEthnicity> reports, String ethnicityVersion, String className) {
        super(className);
        this.id = id;
        this.reports = reports;
        this.ethnicityVersion = ethnicityVersion;
    }


    public String getId() {
        return id;
    }

    public List<DnaEthnicity> getReports() {
        return reports;
    }

    public String getEthnicityVersion() {
        return ethnicityVersion;
    }
}
