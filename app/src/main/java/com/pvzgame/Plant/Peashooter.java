package com.pvzgame.Plant;
import com.pvzgame.Tile;
import com.pvzgame.Map;
public class Peashooter extends Plant {

    // Constructor
    public Peashooter(int birthTime) {
        setBirthTime(birthTime);
        setPlantType(4);
        setPlantName("Peashooter");
        setIsWaterType(false);
        setSunCost(100);
        setPlantHealth(100);
        setPlantCooldown(5);
        setPlantAttackRange(-1);
        setPlantAttackDamage(25);
        setPlantAttackSpeed(4);
    }

}
