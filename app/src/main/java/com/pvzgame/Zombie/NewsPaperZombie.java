package com.pvzgame.Zombie;

public class NewspaperZombie extends Zombie {
    
    // Constructor
    public NewspaperZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieName("NewspaperZombie");
        setIsAquatic(false);
        setZombieHealth(125);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(5);
    }
}
