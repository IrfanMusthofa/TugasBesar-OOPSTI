package com.pvzgame.Zombie;

public class SnorkleZombie extends Zombie{
    
    // Constructor
    public SnorkleZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieName("SnorkleZombie");
        setIsAquatic(true);
        setZombieHealth(125);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(5);
    }
}
