package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class SubTree extends MyHeritageObject{

    private final List<Individual> individuals;
    private final List<Family> families;


    public SubTree(String className, List<Individual> individuals, List<Family> families) {
        super(className);
        this.individuals = individuals;
        this.families = families;
    }

    public List<Individual> getIndividuals() {
        return individuals;
    }

    public List<Family> getFamilies() {
        return families;
    }
}
