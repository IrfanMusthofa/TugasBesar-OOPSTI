package com.pvzgame.Plant;
import com.pvzgame.Zombie;

public class Repeater extends Plant{
    public void createPlant(int currentCol, int timeCreated) {
        setTimeCreated(timeCreated);
        setCurrentCol(currentCol);
        setHealth(100);
        setCooldown(10);
        setAttackDamage(50);
        setAttackSpeed(4);
        setRange(-1);
        setName("Repeater");
        setIsWaterType(false);
        setSunCost(200);
    }
    public void attack(Zombie zombie){
        zombie.attacked(this.getAttackDamage());
    }
}
