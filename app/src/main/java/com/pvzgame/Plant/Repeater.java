package com.pvzgame.Plant;

public class Repeater extends Plant {
    
    // Constructor
    public Repeater(int birthTime) {
        setBirthTime(birthTime);
        setPlantName("Repeater");
        setIsWaterType(false);
        setSunCost(200);
        setPlantHealth(100);
        setPlantCooldown(10);
        setPlantAttackRange(-1);
        setPlantAttackDamage(50);
        setPlantAttackSpeed(4);
    }
}
