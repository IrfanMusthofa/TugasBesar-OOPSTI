package com.pvzgame.Zombie;

public class BucketHeadZombie extends Zombie{
    
    //constructor
    public BucketHeadZombie(int birthTime, int currentRow){
        setBirthTime(birthTime);
        setZombieName("BucketHeadZombie");

        setZombieHealth(300);
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
