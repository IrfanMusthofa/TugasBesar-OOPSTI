package com.pvzgame.Plant;

public class Peashooter extends Plant {
    @Override
    public void createPlant(int currentCol, int timeCreated) {
        settimeCreated(timeCreated);
        setcurrentCol(currentCol);
        sethealth(100);
        setcooldown(10);
        setattackDamage(25);
        setattackSpeed(4);
        setrange(-1);
        setname("Peashooter");
        setisWaterType(false);
        setsunCost(100);
    }
    public void attack(){
        if(true){ //kondisi nyerang

        }
    }

}
