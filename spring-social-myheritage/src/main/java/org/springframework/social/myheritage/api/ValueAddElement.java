package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

import java.util.List;

/**
 * Created by Uziel Sulkies on 01/08/2017.
 */
public class ValueAddElement extends MyHeritageObject {
    private final Integer score;
    private final List<ValueAddFactor> factors;
    private final String factorsDescription;
    private final String className;


    public ValueAddElement(Integer score, List<ValueAddFactor> factors, String factorsDescription, String className) {
        super(className);
        this.score = score;
        this.factors = factors;
        this.factorsDescription = factorsDescription;
        this.className = className;
    }


    public Integer getScore() {
        return score;
    }

    public List<ValueAddFactor> getFactors() {
        return factors;
    }

    public String getFactorsDescription() {
        return factorsDescription;
    }

    @Override
    public String getClassName() {
        return className;
    }
}
