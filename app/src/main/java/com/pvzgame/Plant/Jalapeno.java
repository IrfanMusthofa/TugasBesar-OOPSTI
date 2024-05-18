package com.pvzgame.Plant;

public class Jalapeno extends Plant {
    // Immediately kills all zombies in the row (land)
    // Immediately sacrifices itself
    
    // Constructor
    public Jalapeno(int birthTime) {
        setBirthTime(birthTime);
        setPlantName("Jalapeno");
        setIsWaterType(true);
        setSunCost(125);
        setPlantHealth(100);
        setPlantCooldown(10);
        setPlantAttackRange(-1);
        setPlantAttackDamage(5000);
        setPlantAttackSpeed(0);
    }
}
