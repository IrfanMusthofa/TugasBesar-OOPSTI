package com.pvzgame.Plant;

public class Snowpea extends Plant{
    public void createPlant(int currentCol, int timeCreated) {
        settimeCreated(timeCreated);
        setcurrentCol(currentCol);
        setsunCost(175);
        sethealth(100);
        setcooldown(10);
        setattackDamage(25);
        setattackSpeed(4);
        setrange(-1);
        setisWaterType(false);
        setname("Snowpea");
        
    }
}
