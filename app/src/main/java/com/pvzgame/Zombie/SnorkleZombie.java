package com.pvzgame.Zombie;

public class SnorkleZombie extends Zombie{
    
    // Constructor
    public SnorkleZombie(int birthTime, int currentRow) {
        setBirthTime(birthTime);
        setZombieName("SnorkleZombie");

        setZombieHealth(125);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(4);
        setCurrentCol(11);
        setCurrentRow(currentRow);

        setIsAquatic(false);
        setIsHidden(true);
        setIsSlowed(false);
        setHasTool(true);   
    }

    @Override
    public void zombieAction(){
        if (getCurrentTile().getPlant() != null){// tile.getPlant() != null
            setIsHidden(true);
            // attack
            // getCurrentTile().getPlant().attack();
        } 
        else {
            setIsHidden(false);
            if (true){ // (currenttime - birthtime) % movespeed >= 1
                moveForward();
            }
        }
    }
}
