package org.springframework.social.myheritage.api;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class DnaKitEnumerations {
    public enum DnaKitStatus {
        ZOMBIE (-1),
        INVALID (0),
        VALID (1),
        PHASING (2),
        PHASED (3),
        MATCHING (4),
        MATCHED (5),
        ORDERED (6);
        private  int statusCode;
        DnaKitStatus(int statusCode){
            this.statusCode = statusCode;
        }

    }

    public enum DnaKitError {
        LAB_NO_ERROR (2000),
        LAB_MISSING_CONSENT_FORM (2001),
        LAB_GENDER_NEEDED (2002),
        LAB_DAMAGED_KIT (2003),
        LAB_MISSING_SWABS (2004),
        LAB_4_TO_5_WEEKS_DELAY (2005),
        LAB_10_DAYS_DELAY (2006),
        LAB_CANCELED (2007),
        LAV_SAMPLE_SWAP (2008);
        private  int errorCode;
        DnaKitError(int statusCode){
            this.errorCode = statusCode;
        }

    }
}
