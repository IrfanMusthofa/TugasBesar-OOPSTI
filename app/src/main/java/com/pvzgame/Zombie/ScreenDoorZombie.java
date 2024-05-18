package com.pvzgame.Zombie;

public class ScreenDoorZombie extends Zombie {
   
    // Constructor
    public ScreenDoorZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieName("ScreenDoorZombie");
        setIsAquatic(false);
        setZombieHealth(250);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(5);
    }
}
