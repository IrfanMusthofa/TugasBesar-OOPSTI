package com.pvzgame.Plant;
import com.pvzgame.Zombie;

public class Peashooter extends Plant {
    @Override
    public void createPlant(int currentCol, int timeCreated) {
        setTimeCreated(timeCreated);
        setCurrentCol(currentCol);
        setHealth(100);
        setCooldown(10);
        setAttackDamage(25);
        setAttackSpeed(4);
        setRange(-1);
        setName("Peashooter");
        setIsWaterType(false);
        setSunCost(100);
    }
    public void attack(Zombie zombie){
        zombie.attacked(this.getAttackDamage());
    }

}
