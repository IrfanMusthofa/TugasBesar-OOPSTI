package com.pvzgame.Plant;

public class Lillypad {
    public void createPlant(int currentCol, int timeCreated) {
        setTimeCreated(timeCreated);
        setCurrentCol(currentCol);
        setHealth(100);
        setCooldown(10);
        setAttackDamage(0);
        setAttackSpeed(0);
        setRange(0);
        setName("Lilypad");
        setIsWaterType(true);
        setSunCost(25);
    }

}
