package com.pvzgame.Zombie;

public class NormalZombie extends Zombie {
    
    // Constructor
    public NormalZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieName("NormalZombie");
        setZombieHealth(125);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(4);

        setIsAquatic(false);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(false);        
    }
}
