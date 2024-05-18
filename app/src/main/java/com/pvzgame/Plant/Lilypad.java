package com.pvzgame.Plant;

public class Lilypad extends Plant {

    // Constructor
    public Lilypad(int birthTime) {
        setBirthTime(birthTime);
        setPlantName("Lilypad");
        setIsWaterType(true);
        setSunCost(25);
        setPlantHealth(100);
        setPlantCooldown(10);
        setPlantAttackRange(0);
        setPlantAttackDamage(0);
        setPlantAttackSpeed(0);
    }
}

