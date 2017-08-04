package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class DnaAncestorName extends MyHeritageObject {
    private final String firstName;
    private final String lastName;
    private final String maidenName;
    private final String formerName;

    public DnaAncestorName(String className, String firstName, String lastName, String maidenName, String formerName) {
        super(className);
        this.firstName = firstName;
        this.lastName = lastName;
        this.maidenName = maidenName;
        this.formerName = formerName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public String getFormerName() {
        return formerName;
    }
}
