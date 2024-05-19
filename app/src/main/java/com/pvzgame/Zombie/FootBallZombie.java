package com.pvzgame.Zombie;

public class FootBallZombie extends Zombie{
    

    // constructor
    public FootBallZombie(int birthTime, int currentRow) {
        setBirthTime(birthTime);
        setZombieName("FootballZombie");

        setZombieHealth(500);
        setZombieAttackDamage(75);
        setZombieAttackSpeed(2);
        setZombieMoveSpeed(3);
        setCurrentCol(11);
        setCurrentRow(currentRow);

        setIsAquatic(false);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(true);   
    }
}