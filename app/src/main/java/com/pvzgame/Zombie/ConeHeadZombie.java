package com.pvzgame.Zombie;

public class ConeHeadZombie extends Zombie {
    
    // Constructor
    public ConeHeadZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieName("ConeheadZombie");
        setZombieHealth(250);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(4);

        setIsAquatic(false);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(true);   
    }
}