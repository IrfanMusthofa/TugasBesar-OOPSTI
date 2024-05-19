package com.pvzgame.Zombie;

public class ConeHeadZombie extends Zombie{
    
    //constructor
    public ConeHeadZombie(int birthTime, int currentRow) {
        setBirthTime(birthTime);
        setZombieName("ConeheadZombie");

        setZombieHealth(250);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(4);
        setCurrentCol(currentCol);
        setCurrentRow(currentRow);

        setIsAquatic(false);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(true);   
    }
}
