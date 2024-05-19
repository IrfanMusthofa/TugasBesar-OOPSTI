package com.pvzgame.Zombie;

public class NormalZombie extends Zombie {
    
    // Constructor
    public NormalZombie(int birthTime, int currentRow) {
        setBirthTime(birthTime);
        setZombieName("NormalZombie");

        setZombieHealth(125);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(4);
        setCurrentCol(11);
        setCurrentRow(currentRow);

        setIsAquatic(false);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(false);        
    }
}
