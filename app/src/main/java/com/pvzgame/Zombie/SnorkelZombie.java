package com.pvzgame.Zombie;

public class SnorkelZombie extends Zombie {
    
    // Constructor
    public SnorkelZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieName("SnorkelZombie");
        setZombieHealth(125);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(4);

        setIsAquatic(true);
        setIsHidden(true);
        setIsSlowed(false);
        setHasTool(true);   
    }

    // @Override
    // public void zombieAction(){
    //     if (getCurrentTile().getPlant() != null){// tile.getPlant() != null
    //         setIsHidden(true);
    //         // attack
    //         // getCurrentTile().getPlant().attack();
    //     } 
    //     else {
    //         setIsHidden(false);
    //         if (true){ // (currenttime - birthtime) % movespeed >= 1
    //             moveForward();
    //         }
    //     }
    // }
}
