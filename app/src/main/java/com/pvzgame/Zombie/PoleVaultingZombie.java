package com.pvzgame.Zombie;

public class PoleVaultingZombie extends Zombie{

    // Constructor
    public PoleVaultingZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieName("PoleVaultingZombie");
        setIsAquatic(false);
        setZombieHealth(175);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(5);
    }
}
