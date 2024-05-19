package com.pvzgame.Zombie;

public class DolphinRiderZombie extends Zombie {
    
    // Constructor
    public DolphinRiderZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieType(3);
        setZombieName("DolphinRiderZombie");
        setZombieHealth(175);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(3);

        setIsAquatic(true);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(true);   
    }

    // @Override
    // public void zombieAction() {
    //     if (getZombieHealth() <= 125){ // pengecekan tool dan mengubah status tool
    //         setHasTool(false);
    //         if (getIsSlowed()){
    //             setZombieMoveSpeed(8);
    //         }
    //         else {
    //             setZombieMoveSpeed(4);
    //         }
    //     }
    //     if (getCurrentTile().getPlant() != null){
    //         if (getHasTool()){// hasTool()
    //             moveForward();
    //             setHasTool(false);
    //         } 
    //         else {
    //             // attack
    //             // getCurrentTile().getPlant().attack();
    //         }
    //     } 
    //     else {
    //         if (true){ // (currenttime - birthtime) % movespeed >= 1
    //             moveForward();
    //         }
    //     }
    // }
}
