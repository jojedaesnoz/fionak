package com.jojeda.characterbuilder;

import java.util.ArrayList;
import java.util.List;

public class Characteristic {

    private String name;
    private int score;
    private int modifier;
    private Skill savingThrow;
    private List<Skill> skills;

    {
        skills = new ArrayList<>();
        score = 10;
        modifier = 0;
    }

    public Characteristic(String name) {
        this.name = name;
        savingThrow = new Skill(name + "Saving Throw");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        modifier = (score - 10) / 2;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public Skill getSavingThrow() {
        return savingThrow;
    }

    public void setSavingThrow(Skill savingThrow) {
        this.savingThrow = savingThrow;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public Skill removeSkill(Skill skill) {
        skills.remove(skill);
        return skill;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
