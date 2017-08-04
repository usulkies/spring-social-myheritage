package org.springframework.social.myheritage.api;

import org.springframework.social.myheritage.api.impl.MyHeritageObject;

/**
 * Created by Uziel Sulkies on 03/08/2017.
 */
public class GoalActivity extends MyHeritageObject {

    private final Integer id;
    private final Integer goalId;
    private final Integer variantId;


    public GoalActivity(String className, Integer id, Integer goalId, Integer variantId) {
        super(className);
        this.id = id;
        this.goalId = goalId;
        this.variantId = variantId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getGoalId() {
        return goalId;
    }

    public Integer getVariantId() {
        return variantId;
    }
}
