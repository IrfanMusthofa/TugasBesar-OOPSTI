package com.pvzgame.Zombie;

public class DuckyTubeZombie extends Zombie {
        
    // Constructor
    public DuckyTubeZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieName("DuckyTubeZombie");
        setZombieHealth(100);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(4);

        setIsAquatic(true);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(false);   
    }
}