package com.pvzgame.Plant;

public class Squash extends Plant{
    // Immediately kills the zombie in the same tile or beside it (land)
    // Immediately sacrifices itself

    // Constructor
    public Squash(int birthTime) {
        setBirthTime(birthTime);
        setPlantName("Squash");
        setIsWaterType(false);
        setSunCost(50);
        setPlantHealth(100);
        setPlantCooldown(10);
        setPlantAttackRange(1);
        setPlantAttackDamage(5000);
        setPlantAttackSpeed(0);
    }
}
