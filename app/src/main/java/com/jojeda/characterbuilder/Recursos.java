package com.jojeda.characterbuilder;

import java.util.ArrayList;
import java.util.HashMap;

public class Recursos {

    public final static String STRENGTH = "Strength";
    public final static String DEXTERITY = "Dexterity";
    public final static String CONSTITUTION = "Constitution";
    public final static String INTELLIGENCE = "Intelligence";
    public final static String WISDOM = "Wisdom";
    public final static String CHARISMA = "Charisma";

    public static HashMap<String, Characteristic> characteristics;

    static {
        initializeCharacteristics();
    }

    private static void initializeCharacteristics() {
        characteristics = new HashMap<>();

        Characteristic strength = new Characteristic(STRENGTH);
        strength.addSkill(new Skill("Athletics"));
        strength.getSavingThrow().setProficient(true);
        characteristics.put(STRENGTH, strength);

        Characteristic dexterity = new Characteristic(DEXTERITY);
        dexterity.addSkill(new Skill("Acrobatics"));
        dexterity.addSkill(new Skill("Sleight of hand"));
        dexterity.addSkill(new Skill("Stealth"));
        characteristics.put(DEXTERITY, dexterity);

        Characteristic constitution = new Characteristic(CONSTITUTION);
        characteristics.put(CONSTITUTION, constitution);

        Characteristic intelligence = new Characteristic(INTELLIGENCE);
        intelligence.addSkill(new Skill("Arcana"));
        intelligence.addSkill(new Skill("History"));
        intelligence.addSkill(new Skill("Investigation"));
        characteristics.put(INTELLIGENCE, intelligence);
    }
}
