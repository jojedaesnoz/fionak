package com.jojeda.characterbuilder;

public class Skill {

    private String name;
    private boolean proficient;
    private boolean expert;

    public Skill(String name) {
        this.name = name;
        proficient = false;
        expert = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isProficient() {
        return proficient;
    }

    public void setProficient(boolean proficient) {
        this.proficient = proficient;
        if (!proficient)
            expert = false;
    }

    public boolean isExpert() {
        return expert;
    }

    public void setExpert(boolean expert) {
        this.expert = expert;
        if (expert)
            proficient = true;
    }
}
