package com.pvzgame.Plant;
import com.pvzgame.Zombie;

public class Snowpea extends Plant{
    public void createPlant(int currentCol, int timeCreated) {
        setTimeCreated(timeCreated);
        setCurrentCol(currentCol);
        setSunCost(175);
        setHealth(100);
        setCooldown(10);
        setAttackDamage(25);
        setAtackSpeed(4);
        setRange(-1);
        setIsWaterType(false);
        setName("Snowpea");
    }
    public void attack(Zombie zombie){
        zombie.attacked(this.getAttackDamage());
        zombie.SlowZombie();
    }
}
