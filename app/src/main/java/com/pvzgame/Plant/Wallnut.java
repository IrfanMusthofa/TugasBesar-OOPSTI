package com.pvzgame.Plant;


public class Wallnut extends Plant{
    public void createPlant(int currentCol, int timeCreated) {
        setTimeCreated(timeCreated);
        setCurrentCol(currentCol);
        setHealth(1000);
        setCooldown(20);
        setAttackDamage(0);
        setAttackSpeed(0);
        setRange(0);
        setName("Wallnut");
        setIsWaterType(false);
        setSunCost(50);
    }
}
