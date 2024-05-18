package com.pvzgame.Plant;

public class Kelp extends Plant {
    // Immediately kills the zombie in the same tile (water)
    // Wait first until it kills, then sacrifices itself

    // Constructor
    public Kelp(int birthTime) {
        setBirthTime(birthTime);
        setPlantName("Kelp");
        setIsWaterType(true);
        setSunCost(50);
        setPlantHealth(100);
        setPlantCooldown(10);
        setPlantAttackRange(0);
        setPlantAttackDamage(5000);
        setPlantAttackSpeed(0);
    }
}
